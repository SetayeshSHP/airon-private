package thm.swtp.airon.clientdata.wholeslideimage;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thm.swtp.airon.clientdata.wholeslideimage.model.WholeSlideImage;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WholeSlideImageService {

    final private WholeSlideImageRepository wholeSlideImageRepository;


    public List<WholeSlideImage> GetAllImage() {
        return wholeSlideImageRepository.findAll();
    }

    public WholeSlideImage addNewImage(WholeSlideImage image) {

        Optional<WholeSlideImage> imageOptional = wholeSlideImageRepository.findAnalysisById(image.getId());

        if (imageOptional.isPresent()) {
            throw new IllegalStateException("Die Whole Slide Image existiert schon");
        }
        wholeSlideImageRepository.save(image);
        return image;
    }

    public  WholeSlideImage updateImage(WholeSlideImage image){
        wholeSlideImageRepository.save(image);
        return image;
    }

    public  void deleteImage(Long id){
        wholeSlideImageRepository.deleteById(id);
    }

}
