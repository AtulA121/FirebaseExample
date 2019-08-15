package com.firebaseExample.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.firebaseExample.model.Notification;
import com.firebaseExample.model.NotificationRequest;

@Controller
public class MyController
{
	@RequestMapping("/")
	public String firebase()
	{
		System.out.println("Request comes successfully :");
		return "firebase.jsp";
	}
	
	@RequestMapping("/sendData")
	@ResponseBody
	public String sendData() throws Exception 
	{
	/*	FileInputStream serviceAccount=new FileInputStream("./ServiceACCOUNTKey.json");
		FirebaseOptions options=new FirebaseOptions.Builder().setCredentials(GoogleCredentials.fromStream(serviceAccount)).build();
		
		FirebaseApp.initializeApp(options);
		
		Firestore db=FirestoreClient.getFirestore();
		db.collection("sampleData22").document("inspiration2").set("hiiiii22");
	*/	
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "key=AIzaSyB2Z8Vg1_2LldeXs1rfWQNtgGPeWj1Do6E");
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		NotificationRequest notificationRequest=new NotificationRequest();
		
		Notification notification=new Notification();
		notification.setTitle(" Firebase Notification : ");
		notification.setBody("Hii , How are you ? ");
		notification.setContentAvailable(true);
		notification.setPriority("high");
		
		notificationRequest.setTo("ccUm_DEMccg:APA91bGgRumm_LgYJIVfyUpegSsl0lnFDPfxcpFlomp54WLVpKllHIgepNaeIsvUXzdNtiMx3JHXmFOpfCZ3AYBC54Yzcs3gVt4CJZGDj8AGUMrNNQO4k0B2GRDStd5WHREp0tR9Qwtm");
		notificationRequest.setNotification(notification);
		
		System.out.println("Notification : "+notificationRequest.toString());
		
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Object> httpEntity = new HttpEntity<>(notificationRequest, headers);
		
		System.out.println("HttpEntity : "+httpEntity.toString());
		
		try
		{
			String object = restTemplate.postForObject("https://fcm.googleapis.com/fcm/send", httpEntity,
					String.class);
			System.out.println("Object is :"+object);
		}
		catch(Exception e)
		{
			System.out.println(""+e);
		}
		System.out.println("Send Messsage to Topic - 'general' successfully : ");
		return "Inserted successfully :";
	}
	
	@RequestMapping("/sendToDatabase")
	public void sendToDatabase()
	{
		
		System.out.println("Done :");
	}
}
