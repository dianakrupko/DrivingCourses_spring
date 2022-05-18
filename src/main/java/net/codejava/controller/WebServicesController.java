package net.codejava.controller;


import net.codejava.model.Courses;
import net.codejava.repository.CoursesRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = WebServicesController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class WebServicesController {

    public static final String REST_URL = "/rest/courses";

    //    @GetMapping
//    public String sayREST(){
//        return "Great, let`s take a REST with Spring Boot!";
//
//    }
    @Autowired
    private CoursesRepository coursesRepository;

    //    @RequestMapping(method = RequestMethod.GET)
//    public String allcourses(){
//
//        return "courses";
//    }
//    @GetMapping("/{id}")
//    public String someCourses(Model model, @PathVariable int id){
//        Optional<Courses> course=coursesRepository.getById(id);
//        model.addAttribute("course", course);
//        return "instructor";
//    }
    @GetMapping
    public List<Courses> getAllCourses() {
        return (List<Courses>) coursesRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Courses> getCoursesById(@PathVariable(value = "id") int id_courses) throws ResourceNotFoundException {
        Courses courses = coursesRepository.findById(id_courses).orElseThrow(() -> new ResourceNotFoundException("Not found " + id_courses));
        return ResponseEntity.ok().body(courses);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Courses createCourse(@Valid @RequestBody Courses course) {
        return coursesRepository.save(course);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Courses> updateCourses(@PathVariable(value = "id") int id_courses,@Valid @RequestBody Courses coursesDetails) throws ResourceNotFoundException {
    Courses courses = coursesRepository.findById(id_courses)
            .orElseThrow(()-> new ResourceNotFoundException("Not found"));


            courses.setId_instructor(coursesDetails.getId_instructor());
            courses.setName(coursesDetails.getName());
            courses.setCost(coursesDetails.getCost());
            courses.setDuration(coursesDetails.getDuration());
            courses.setQuality(coursesDetails.getQuality());

            final Courses updatedCourses = coursesRepository.save(courses);
            return ResponseEntity.ok(updatedCourses);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteCourses(@PathVariable(value = "id") int id_courses)
        throws ResourceNotFoundException{
        Courses course = coursesRepository.findById(id_courses)
                .orElseThrow(()-> new ResourceNotFoundException("Not found"+id_courses));
        coursesRepository.delete(course);
        Map<String,Boolean> responce =new HashMap<>();
        responce.put("deleted", Boolean.TRUE);

        return responce;
    }

}
