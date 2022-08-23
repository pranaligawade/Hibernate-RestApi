package com.LearningSpring.LearningSpringFramework.SimpleController;
//sending response in the right format


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
@GetMapping("/sum")
 public  long displaysum(){
 return 100;
}
}
 // business logic
class BusinessServie{

}
// getting data
 class DataServices{

 }