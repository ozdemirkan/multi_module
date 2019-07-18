package name;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NameController {

  @GetMapping("/")
  public String getName() {
    return "Jib Multimodule";
  }
}
