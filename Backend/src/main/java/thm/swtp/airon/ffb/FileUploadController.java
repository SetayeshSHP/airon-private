/*
package thm.swtp.airon.ffb;


import io.micrometer.core.ipc.http.HttpSender;
import org.apache.tomcat.util.http.fileupload.FileItemIterator;
import org.apache.tomcat.util.http.fileupload.FileItemStream;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.util.Streams;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@RestController
public class FileUploadController {
    @PostMapping ("/upload")
    public @ResponseBody Response<String> upload(HttpServletRequest request) {
        try {
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            if (!isMultipart) {
                // Inform user about invalid request
                Response<String> responseObject = new Response<String>(false, "Not a multipart request.", "");
                return responseObject;
            }

            // Create a new file upload handler
            ServletFileUpload upload = new ServletFileUpload();

            // Parse the request
            FileItemIterator iter = upload.getItemIterator(request);
            while (iter.hasNext()) {
                FileItemStream item = iter.next();
                String name = item.getFieldName();
                InputStream stream = item.openStream();
                if (!item.isFormField()) {
                    String filename = item.getName();
                    // Process the input stream
                    OutputStream out = new FileOutputStream(filename);
                    IOUtils.copy(stream, out);
                    stream.close();
                    out.close();
                }
            }
        } catch (FileUploadException e) {
            return new Response<String>(false, "File upload error", e.toString());
        } catch (IOException e) {
            return new Response<String>(false, "Internal server IO error", e.toString());
        }

        return new Response<String>(true, "Success", "");
    }


    @GetMapping("/uploader")
    public ModelAndView uploaderPage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("uploader");
        return model;
    }

}


 */