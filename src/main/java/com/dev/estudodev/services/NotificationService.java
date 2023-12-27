package com.dev.estudodev.services;

import com.dev.estudodev.domain.users.User;
import com.dev.estudodev.dto.NotificationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {

    @Autowired
    private RestTemplate restTemplate;
    public void sendNotification(User users , String message) throws Exception {
        String email = users.getEmail();
        NotificationDto notificationRequest = new NotificationDto(email,message);
//        ResponseEntity<String> notificationResponse =restTemplate.postForEntity("(http://o4d9z.mocklab.io/notify",notificationRequest,String.class);
//         if(!(notificationResponse.getStatusCode() == HttpStatus.OK)){
//             throw new Exception(" SERVIÇO FORA DO AR ");
//         }
    }

}
