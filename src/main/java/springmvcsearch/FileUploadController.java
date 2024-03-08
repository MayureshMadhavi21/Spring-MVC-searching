package springmvcsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}

	@RequestMapping(value = "/uploadimage", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("file") CommonsMultipartFile file, HttpSession httpSession , Model model) {
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		System.out.println(file.getOriginalFilename());
		byte[] data = file.getBytes();
		// save this file to server
		String path = httpSession.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "Resources"
				+ File.separator + "images" + File.separator + file.getOriginalFilename();
		System.out.println(path);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("File Uploaded");
			model.addAttribute("msg","uploaded successfully");
			model.addAttribute("filename",file.getOriginalFilename());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("uploading error");
			model.addAttribute("msg","uploaded error");
		}
		return "filesuccess";
	}
}
