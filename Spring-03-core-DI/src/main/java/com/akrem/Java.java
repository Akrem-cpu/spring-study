package com.akrem;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {
//    // filed injection
//    @Autowired
//    OfficeHours officeHours ;

    OfficeHours officeHours;




    public void getTeachingHours(){
        System.out.println("weekly teaching hours : "+(20+officeHours.getHours()) );
    }
}
