package guru.springframework.springrestclientexamples.services;


import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private static final String GET_USERS = "http://private-anon-43fa0b9509-apifaketory.apiary-mock.com/api/user?limit=";

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate.getForObject( GET_USERS + limit, UserData.class);
        return userData.getData();
    }
}
