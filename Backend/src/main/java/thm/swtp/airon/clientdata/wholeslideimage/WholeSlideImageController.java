package thm.swtp.airon.clientdata.wholeslideimage;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thm.swtp.airon.clientdata.wholeslideimage.model.WholeSlideImage;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("image")
@CrossOrigin(origins = "http://localhost:3000")
public class WholeSlideImageController {

    final private WholeSlideImageService wholeSlideImageService;

    @GetMapping(value = "get-all-image")
    public List<WholeSlideImage> getAllImage (){
        return wholeSlideImageService.GetAllImage();
    }


    @PostMapping(value="add-image")
    public ResponseEntity<WholeSlideImage> addNewImage(@RequestBody WholeSlideImage image){
        image = wholeSlideImageService.addNewImage(image);
        return ResponseEntity.status(HttpStatus.CREATED).body(image);
    }


    @PutMapping(value = "update-image")
    public ResponseEntity<WholeSlideImage> updateImage(@RequestBody WholeSlideImage image){
        wholeSlideImageService.updateImage(image);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(image);
    }


    @DeleteMapping(value = "delete-image/{id}")
    public ResponseEntity<String> deleteAnalysis(@PathVariable Long id){
        wholeSlideImageService.deleteImage(id);
        return  ResponseEntity.status(HttpStatus.OK).body("Bild wurde gelöscht");

    }

}
