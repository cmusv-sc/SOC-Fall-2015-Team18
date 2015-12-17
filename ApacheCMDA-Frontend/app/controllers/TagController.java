/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import models.metadata.Tag;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.climate.*;


public class TagController extends Controller {

    final static Form<Tag> tagForm = Form
            .form(Tag.class);

    public static Result home(String email, String vfile, String dataset) {
        return ok(home.render(email, vfile, dataset));
    }


    public static Result tags() {
        return ok(tags.render(Tag.all(), tagForm));
    }
	
    public static Result tagCloud() {
        return ok(tagCloud.render());
    }

/*


	public static Result editClimateService() {

		ObjectNode jsonData = Json.newObject();
		try {
			DynamicForm df = DynamicForm.form().bindFromRequest();
			String climateServiceName = df.field("pk").value();

			if (climateServiceName != null && !climateServiceName.isEmpty()) {
				jsonData.put("name", climateServiceName);
			}
			ClimateService originalService = ClimateService.findServiceByName(climateServiceName);
			
			if (originalService == null) {
				Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
				return notFound("not found original climateService " + climateServiceName);
			}

			jsonData.put("creatorId", 1);
			jsonData.put("purpose", originalService.getPurpose());
			jsonData.put("url", originalService.getUrl());
			jsonData.put("scenario", originalService.getScenario());
			jsonData.put("versionNo", originalService.getVersion());
			
			if (originalService.getRootservice() != null)
				
				jsonData.put("rootServiceId", originalService.getRootservice());
			String editField = df.field("name").value();
			
			if (editField != null && !editField.isEmpty()) {
				jsonData.put(editField, df.field("value").value());
			}
			
			if (editField == null || editField.isEmpty()) {
				Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
				return notFound("not found edit field");
			}

			JsonNode response = ClimateService.edit(climateServiceName, jsonData);
			Application.flashMsg(response);

		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}
		return ok("updated");

	}


	public static Result deleteClimateService() throws UnsupportedEncodingException {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		String climateServiceId = df.field("idHolder").value();
		Logger.debug(climateServiceId);
		JsonNode response = ClimateService.delete(climateServiceId);
		Application.flashMsg(response);
		return redirect("/tag/climateServices");
	}


	public static Result downloadClimateService() {
		List<ClimateService> user = ClimateService.all();
		ObjectMapper mapper = new ObjectMapper();
		File file = new File("user.json");
		try {
			mapper.writeValue(file, user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response().setContentType("application/x-download");
		response().setHeader("Content-disposition",
				"attachment; filename=user.json");
		return ok(file);
	}
*/

    public static Result oneService(String url) {
        return ok(oneService.render("/assets/html/" + url));
    }


}
