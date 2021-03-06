package com.saltsoftware.factory.dentalService;
/*
*@Author: Abram Rakgotho
*Student Number: 215031393
*Created a factory class
 */


import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.util.GenericHelper;

public class ServiceFactory
{

    public static Service createService(String sName, String sDescription)
    {

        String serviceId = GenericHelper.generateID();
        Service service = new Service.Builder()
                .setServiceDescrip(sDescription)
                .setServiceName(sName)
                .setServiceId(serviceId)
                .build();

        return service;




    }

}
