package com.example.demo;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;
import java.util.Map;

@RestController
public class FirstController {

    @RequestMapping(value = "/person/{personId}",method = RequestMethod.GET)
    public String findName(@PathVariable("personId")Integer personId){
        Person person=new Person(personId,"TOM",23);
        Map<String ,String> parameterMap= Maps.newHashMap();
        parameterMap.put("PersonId",person.getPersonId().toString());
        parameterMap.put("Pname",person.getPname());
        parameterMap.put("Page",Integer.toString(person.getPage()));
        String str=JSON.toJSONString(parameterMap);
        return str;
    }


}
