package org.foflo.cubin.resource;

import javax.ws.rs.core.Response;

import org.foflo.cubin.uo.ImageUploadObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Component
@RequestMapping("/cubin/aws")
public class CubInAwsResourceV1 {
	private Logger logger = LoggerFactory.getLogger(CubInAwsResourceV1.class);
	
	@RequestMapping(value = "/s3/upload", produces = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public  Response saveImage(@RequestBody ImageUploadObject imageUploadObject)throws Exception{
		if(imageUploadObject==null){
			logger.error("Input object is null");
			return null;
		}
		System.out.println("Sussecct rest app test!");
		
		logger.info("Input Object: "+imageUploadObject.toString());
//		String url = amazonS3Service.uploadImageFile(imageUploadObject);
		return Response.status(500).entity(imageUploadObject).build();
	}
}
