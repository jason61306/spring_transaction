package transaction.demo.transaction_demo.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import transaction.demo.transaction_demo.model.Table1;
import transaction.demo.transaction_demo.model.Table2;

import transaction.demo.transaction_demo.service.Table1Service;
import transaction.demo.transaction_demo.service.Table2Service;



@RestController
@RequestMapping("/transcation")
public class TranscationController {

    @Autowired
    private Table1Service table1Service;
    @Autowired
    private Table2Service table2Service;
    
    @GetMapping(value = "/table1")
    public List<Table1> table1() {
        return table1Service.findAll();
    }

    @GetMapping(value = "/table2")
    public List<Table2> table2() {
        return table2Service.findAll();
    }



    @Transactional()
    @PostMapping(value = "/case1_1")
    public String case1_1(@RequestBody String body) {          
        JSONObject jsonObject =  new JSONObject(body); 
        String table1_name = jsonObject.getJSONObject("table1").getString("name");   
        String table2_name = jsonObject.getJSONObject("table2").getString("name");                                         
        Table1 table1 = new Table1();
        Table2 table2 = new Table2();
        table1.setName(table1_name);        
        table2.setName(table2_name);        
        table1Service.save(table1);            
        table2Service.save_REQUIRED(table2);              
        return "ok";                                     
    }

    @Transactional()
    @PostMapping(value = "/case1_2")
    public String case1_2(@RequestBody String body) {                    
        JSONObject jsonObject =  new JSONObject(body);  
        String table1_name = jsonObject.getJSONObject("table1").getString("name");   
        String table2_name = jsonObject.getJSONObject("table2").getString("name"); 
        Table1 table1 = new Table1();
        Table2 table2 = new Table2();
        table1.setName(table1_name);        
        table2.setName(table2_name);
        try {                                                  
            table1Service.save(table1);            
            table2Service.save_REQUIRED(table2);      
        } catch (Exception e) {            
            return e.toString();         
        }
        return "ok";                              
    }

    @Transactional()
    @PostMapping(value = "/case1_3")
    public String case1_3(@RequestBody String body) {          
        JSONObject jsonObject =  new JSONObject(body); 
        String table1_name = jsonObject.getJSONObject("table1").getString("name");   
        String table2_name = jsonObject.getJSONObject("table2").getString("name");                                         
        Table1 table1 = new Table1();
        Table2 table2 = new Table2();
        table1.setName(table1_name);        
        table2.setName(table2_name);        
        table1Service.save(table1);            
        table2Service.save_REQUIRED_success(table2);
        System.out.print(0/0);              
        return "ok";                                     
    }

    @PostMapping(value = "/case1_4")
    public String case1_4(@RequestBody String body) {          
        JSONObject jsonObject =  new JSONObject(body); 
        String table1_name = jsonObject.getJSONObject("table1").getString("name");   
        String table2_name = jsonObject.getJSONObject("table2").getString("name");                                         
        Table1 table1 = new Table1();
        Table2 table2 = new Table2();
        table1.setName(table1_name);        
        table2.setName(table2_name);        
        table1Service.save(table1);            
        table2Service.save_REQUIRED(table2);              
        return "ok";       
    }

    

    @Transactional()
    @PostMapping(value = "/case2_1")
    public String case2_1(@RequestBody String body) {          
        JSONObject jsonObject =  new JSONObject(body); 
        String table1_name = jsonObject.getJSONObject("table1").getString("name");   
        String table2_name = jsonObject.getJSONObject("table2").getString("name");                                         
        Table1 table1 = new Table1();
        Table2 table2 = new Table2();
        table1.setName(table1_name);        
        table2.setName(table2_name);        
        table1Service.save(table1);            
        table2Service.save_REQUIRES_NEW(table2);              
        return "ok";                                     
    }


    @PostMapping(value = "/case2_2")
    public String case2_2(@RequestBody String body) {                    
        JSONObject jsonObject =  new JSONObject(body);  
        String table1_name = jsonObject.getJSONObject("table1").getString("name");   
        String table2_name = jsonObject.getJSONObject("table2").getString("name"); 
        Table1 table1 = new Table1();
        Table2 table2 = new Table2();
        table1.setName(table1_name);        
        table2.setName(table2_name);
        try {                                                  
            table1Service.save(table1);            
            table2Service.save_REQUIRES_NEW(table2);      
        } catch (Exception e) {            
            return e.toString();       
        }
        return "ok";                                           
    }

    @Transactional()
    @PostMapping(value = "/case2_3")
    public String case2_3(@RequestBody String body) {          
        JSONObject jsonObject =  new JSONObject(body); 
        String table1_name = jsonObject.getJSONObject("table1").getString("name");   
        String table2_name = jsonObject.getJSONObject("table2").getString("name");                                         
        Table1 table1 = new Table1();
        Table2 table2 = new Table2();
        table1.setName(table1_name);        
        table2.setName(table2_name);        
        table1Service.save(table1);            
        table2Service.save_REQUIRES_NEW_success(table2);
        System.out.print(0/0);              
        return "ok";                                     
    }

    @PostMapping(value = "/case2_4")
    public String case2_4(@RequestBody String body) {          
        JSONObject jsonObject =  new JSONObject(body); 
        String table1_name = jsonObject.getJSONObject("table1").getString("name");   
        String table2_name = jsonObject.getJSONObject("table2").getString("name");                                         
        Table1 table1 = new Table1();
        Table2 table2 = new Table2();
        table1.setName(table1_name);        
        table2.setName(table2_name);        
        table1Service.save(table1);            
        table2Service.save_REQUIRES_NEW(table2);              
        return "ok";                                     
    }


}
