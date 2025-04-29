package edu.icet.ecom.Controller;


import edu.icet.ecom.Dto.AdminDto;
import edu.icet.ecom.Service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {


    private final AdminService service;

    @PostMapping("/add")
    public AdminDto add (@RequestBody AdminDto adminDto){
        return service.add(adminDto);
    }

    @PostMapping("/login")
    public ResponseEntity<AdminDto> login(@RequestBody AdminDto request){
        AdminDto dto = service.login(request.getEmail(),request.getPassword());
        return ResponseEntity.ok(dto);
    }

}
