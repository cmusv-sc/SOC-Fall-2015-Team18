// @SOURCE:/home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/conf/routes
// @HASH:1d970e49c30fbdf1edecf862208ab7aab7d5ee9e
// @DATE:Fri Dec 11 08:39:54 UTC 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_ClimateServiceController_home0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:7
private[this] lazy val controllers_ClimateServiceController_home1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:11
private[this] lazy val controllers_BugReportController_reports2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugs"))))
        

// @LINE:12
private[this] lazy val controllers_BugReportController_newReport3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newReport"))))
        

// @LINE:13
private[this] lazy val controllers_BugReportController_list4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bug/list"))))
        

// @LINE:14
private[this] lazy val controllers_BugReportController_deleteReport5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/report"))))
        

// @LINE:15
private[this] lazy val controllers_BugReportController_solveReport6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("solve/report"))))
        

// @LINE:18
private[this] lazy val controllers_AboutusController_aboutUs7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
        

// @LINE:19
private[this] lazy val controllers_AboutusController_aboutProject8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutProject"))))
        

// @LINE:22
private[this] lazy val controllers_ClimateServiceController_home9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate"))))
        

// @LINE:23
private[this] lazy val controllers_ClimateServiceController_tutorial10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/tutorial"))))
        

// @LINE:24
private[this] lazy val controllers_ClimateServiceController_climateServices11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/climateServices"))))
        

// @LINE:25
private[this] lazy val controllers_ClimateServiceController_mostRecentlyAddedClimateServices12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyAddedClimateServices"))))
        

// @LINE:26
private[this] lazy val controllers_ClimateServiceController_mostRecentlyUsedClimateServices13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyUsedClimateServices"))))
        

// @LINE:27
private[this] lazy val controllers_ClimateServiceController_mostPopularClimateServices14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostPopularClimateServices"))))
        

// @LINE:28
private[this] lazy val controllers_ClimateServiceController_newClimateService15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:29
private[this] lazy val controllers_ClimateServiceController_deleteClimateService16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/delete/climateServices"))))
        

// @LINE:30
private[this] lazy val controllers_ClimateServiceController_downloadClimateService17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/download/climateServices"))))
        

// @LINE:31
private[this] lazy val controllers_ClimateServiceController_editClimateService18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/edit/climateServices"))))
        

// @LINE:32
private[this] lazy val controllers_ClimateServiceController_addClimateServices19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:33
private[this] lazy val controllers_ClimateServiceController_oneService20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/oneService"))))
        

// @LINE:36
private[this] lazy val controllers_WorkflowController_createWorkflow21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/createWorkflow"))))
        

// @LINE:37
private[this] lazy val controllers_WorkflowController_workflows22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflows"))))
        

// @LINE:38
private[this] lazy val controllers_WorkflowController_handleCreateWorkflow23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/workflowCreating"))))
        

// @LINE:39
private[this] lazy val controllers_WorkflowController_linkTags24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/linkTags"))))
        

// @LINE:40
private[this] lazy val controllers_WorkflowController_displayWorkflow25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/disWorkflow"))))
        

// @LINE:41
private[this] lazy val controllers_WorkflowController_addLevelComment26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/newLevel/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:42
private[this] lazy val controllers_WorkflowController_addSingleComment27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/newComment/"),DynamicPart("wid", """[^/]+""",true),StaticPart("/"),DynamicPart("lid", """[^/]+""",true))))
        

// @LINE:44
private[this] lazy val controllers_WorkflowController_workflowsByTopViewCount28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getTop10WorkflowsByViewCount"))))
        

// @LINE:47
private[this] lazy val controllers_TagController_home29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag"))))
        

// @LINE:48
private[this] lazy val controllers_TagController_tags30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/tags"))))
        

// @LINE:49
private[this] lazy val controllers_TagController_oneService31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/oneService"))))
        

// @LINE:50
private[this] lazy val controllers_TagController_tagCloud32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/tagCloud"))))
        

// @LINE:54
private[this] lazy val controllers_DatasetController_datasetList33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/datasets"))))
        

// @LINE:55
private[this] lazy val controllers_DatasetController_searchDataset34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/searchDataSet"))))
        

// @LINE:56
private[this] lazy val controllers_DatasetController_getSearchResult35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/getSearchResult"))))
        

// @LINE:59
private[this] lazy val controllers_Assets_at36 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:62
private[this] lazy val controllers_UserController_profile37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/myProfile"))))
        

// @LINE:63
private[this] lazy val controllers_UserController_allUsers38 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/allUsers"))))
        

// @LINE:64
private[this] lazy val controllers_UserController_signUpForm39 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/signUpForm"))))
        

// @LINE:65
private[this] lazy val controllers_UserController_signUp40 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/signUp"))))
        

// @LINE:66
private[this] lazy val controllers_UserController_signInForm41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/signInForm"))))
        

// @LINE:67
private[this] lazy val controllers_UserController_signIn42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/signIn"))))
        

// @LINE:68
private[this] lazy val controllers_UserController_signOut43 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/signOut"))))
        

// @LINE:69
private[this] lazy val controllers_UserController_showFriends44 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/friends"))))
        

// @LINE:70
private[this] lazy val controllers_UserController_addFriend45 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/addfriend"))))
        

// @LINE:71
private[this] lazy val controllers_UserController_deleteFriend46 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/deletefriend"))))
        

// @LINE:72
private[this] lazy val controllers_UserController_addSubscribe47 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/addSubscribe"))))
        

// @LINE:73
private[this] lazy val controllers_UserController_deleteSubscribe48 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/deleteSubscribe"))))
        

// @LINE:74
private[this] lazy val controllers_UserController_showSubscriptions49 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/subscriptions"))))
        

// @LINE:75
private[this] lazy val controllers_UserController_oneUser50 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/account/"),DynamicPart("userId", """[^/]+""",true))))
        

// @LINE:76
private[this] lazy val controllers_UserGroupController_showGroups51 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usergroups/all"))))
        

// @LINE:77
private[this] lazy val controllers_UserGroupController_newGroup52 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usergroups/addGroup"))))
        

// @LINE:78
private[this] lazy val controllers_UserGroupController_newGroupForm53 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usergroups/addGroupForm"))))
        

// @LINE:79
private[this] lazy val controllers_UserGroupController_oneGroup54 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usergroups/"),DynamicPart("userGroupId", """[^/]+""",true))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix,"""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugs""","""controllers.BugReportController.reports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newReport""","""controllers.BugReportController.newReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bug/list""","""controllers.BugReportController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/report""","""controllers.BugReportController.deleteReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solve/report""","""controllers.BugReportController.solveReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.AboutusController.aboutUs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutProject""","""controllers.AboutusController.aboutProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/tutorial""","""controllers.ClimateServiceController.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/climateServices""","""controllers.ClimateServiceController.climateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyAddedClimateServices""","""controllers.ClimateServiceController.mostRecentlyAddedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyUsedClimateServices""","""controllers.ClimateServiceController.mostRecentlyUsedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostPopularClimateServices""","""controllers.ClimateServiceController.mostPopularClimateServices()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.newClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/delete/climateServices""","""controllers.ClimateServiceController.deleteClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/download/climateServices""","""controllers.ClimateServiceController.downloadClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/edit/climateServices""","""controllers.ClimateServiceController.editClimateService()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.addClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/oneService""","""controllers.ClimateServiceController.oneService(url:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/createWorkflow""","""controllers.WorkflowController.createWorkflow()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflows""","""controllers.WorkflowController.workflows()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/workflowCreating""","""controllers.WorkflowController.handleCreateWorkflow()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/linkTags""","""controllers.WorkflowController.linkTags()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/disWorkflow""","""controllers.WorkflowController.displayWorkflow(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/newLevel/$id<[^/]+>""","""controllers.WorkflowController.addLevelComment(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/newComment/$wid<[^/]+>/$lid<[^/]+>""","""controllers.WorkflowController.addSingleComment(wid:Long, lid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getTop10WorkflowsByViewCount""","""controllers.WorkflowController.workflowsByTopViewCount()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag""","""controllers.TagController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/tags""","""controllers.TagController.tags()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/oneService""","""controllers.TagController.oneService(url:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/tagCloud""","""controllers.TagController.tagCloud()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/datasets""","""controllers.DatasetController.datasetList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/searchDataSet""","""controllers.DatasetController.searchDataset()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/getSearchResult""","""controllers.DatasetController.getSearchResult()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/myProfile""","""controllers.UserController.profile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/allUsers""","""controllers.UserController.allUsers()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/signUpForm""","""controllers.UserController.signUpForm()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/signUp""","""controllers.UserController.signUp()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/signInForm""","""controllers.UserController.signInForm()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/signIn""","""controllers.UserController.signIn()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/signOut""","""controllers.UserController.signOut()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/friends""","""controllers.UserController.showFriends()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/addfriend""","""controllers.UserController.addFriend(userId:Long, isSubscribe:Boolean)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/deletefriend""","""controllers.UserController.deleteFriend(userId:Long, isSubscribe:Boolean)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/addSubscribe""","""controllers.UserController.addSubscribe(userId:Long, isFriend:Boolean)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/deleteSubscribe""","""controllers.UserController.deleteSubscribe(userId:Long, isFriend:Boolean)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/subscriptions""","""controllers.UserController.showSubscriptions()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/account/$userId<[^/]+>""","""controllers.UserController.oneUser(userId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usergroups/all""","""controllers.UserGroupController.showGroups()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usergroups/addGroup""","""controllers.UserGroupController.newGroup()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usergroups/addGroupForm""","""controllers.UserGroupController.newGroupForm()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usergroups/$userGroupId<[^/]+>""","""controllers.UserGroupController.oneGroup(userGroupId:Long)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_ClimateServiceController_home0(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Home page""", Routes.prefix + """home"""))
   }
}
        

// @LINE:7
case controllers_ClimateServiceController_home1(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:11
case controllers_BugReportController_reports2(params) => {
   call { 
        invokeHandler(controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Nil,"GET", """ BugReporting""", Routes.prefix + """bugs"""))
   }
}
        

// @LINE:12
case controllers_BugReportController_newReport3(params) => {
   call { 
        invokeHandler(controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Nil,"GET", """""", Routes.prefix + """newReport"""))
   }
}
        

// @LINE:13
case controllers_BugReportController_list4(params) => {
   call { 
        invokeHandler(controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Nil,"GET", """""", Routes.prefix + """bug/list"""))
   }
}
        

// @LINE:14
case controllers_BugReportController_deleteReport5(params) => {
   call { 
        invokeHandler(controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Nil,"POST", """""", Routes.prefix + """delete/report"""))
   }
}
        

// @LINE:15
case controllers_BugReportController_solveReport6(params) => {
   call { 
        invokeHandler(controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Nil,"POST", """""", Routes.prefix + """solve/report"""))
   }
}
        

// @LINE:18
case controllers_AboutusController_aboutUs7(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutUs(), HandlerDef(this, "controllers.AboutusController", "aboutUs", Nil,"GET", """ About Us""", Routes.prefix + """aboutus"""))
   }
}
        

// @LINE:19
case controllers_AboutusController_aboutProject8(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutProject(), HandlerDef(this, "controllers.AboutusController", "aboutProject", Nil,"GET", """""", Routes.prefix + """aboutProject"""))
   }
}
        

// @LINE:22
case controllers_ClimateServiceController_home9(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Climate Model""", Routes.prefix + """climate"""))
   }
}
        

// @LINE:23
case controllers_ClimateServiceController_tutorial10(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Nil,"GET", """""", Routes.prefix + """climate/tutorial"""))
   }
}
        

// @LINE:24
case controllers_ClimateServiceController_climateServices11(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.climateServices(), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Nil,"GET", """""", Routes.prefix + """climate/climateServices"""))
   }
}
        

// @LINE:25
case controllers_ClimateServiceController_mostRecentlyAddedClimateServices12(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostRecentlyAddedClimateServices"""))
   }
}
        

// @LINE:26
case controllers_ClimateServiceController_mostRecentlyUsedClimateServices13(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostRecentlyUsedClimateServices"""))
   }
}
        

// @LINE:27
case controllers_ClimateServiceController_mostPopularClimateServices14(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostPopularClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostPopularClimateServices"""))
   }
}
        

// @LINE:28
case controllers_ClimateServiceController_newClimateService15(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Nil,"POST", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:29
case controllers_ClimateServiceController_deleteClimateService16(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Nil,"POST", """""", Routes.prefix + """climate/delete/climateServices"""))
   }
}
        

// @LINE:30
case controllers_ClimateServiceController_downloadClimateService17(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Nil,"POST", """""", Routes.prefix + """climate/download/climateServices"""))
   }
}
        

// @LINE:31
case controllers_ClimateServiceController_editClimateService18(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Nil,"POST", """""", Routes.prefix + """climate/edit/climateServices"""))
   }
}
        

// @LINE:32
case controllers_ClimateServiceController_addClimateServices19(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Nil,"GET", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:33
case controllers_ClimateServiceController_oneService20(params) => {
   call(params.fromQuery[String]("url", Some(null))) { (url) =>
        invokeHandler(controllers.ClimateServiceController.oneService(url), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/oneService"""))
   }
}
        

// @LINE:36
case controllers_WorkflowController_createWorkflow21(params) => {
   call { 
        invokeHandler(controllers.WorkflowController.createWorkflow(), HandlerDef(this, "controllers.WorkflowController", "createWorkflow", Nil,"GET", """Workflow""", Routes.prefix + """workflow/createWorkflow"""))
   }
}
        

// @LINE:37
case controllers_WorkflowController_workflows22(params) => {
   call { 
        invokeHandler(controllers.WorkflowController.workflows(), HandlerDef(this, "controllers.WorkflowController", "workflows", Nil,"GET", """""", Routes.prefix + """workflows"""))
   }
}
        

// @LINE:38
case controllers_WorkflowController_handleCreateWorkflow23(params) => {
   call { 
        invokeHandler(controllers.WorkflowController.handleCreateWorkflow(), HandlerDef(this, "controllers.WorkflowController", "handleCreateWorkflow", Nil,"POST", """""", Routes.prefix + """workflow/workflowCreating"""))
   }
}
        

// @LINE:39
case controllers_WorkflowController_linkTags24(params) => {
   call { 
        invokeHandler(controllers.WorkflowController.linkTags(), HandlerDef(this, "controllers.WorkflowController", "linkTags", Nil,"GET", """""", Routes.prefix + """workflow/linkTags"""))
   }
}
        

// @LINE:40
case controllers_WorkflowController_displayWorkflow25(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.WorkflowController.displayWorkflow(id), HandlerDef(this, "controllers.WorkflowController", "displayWorkflow", Seq(classOf[Long]),"GET", """""", Routes.prefix + """workflow/disWorkflow"""))
   }
}
        

// @LINE:41
case controllers_WorkflowController_addLevelComment26(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.WorkflowController.addLevelComment(id), HandlerDef(this, "controllers.WorkflowController", "addLevelComment", Seq(classOf[Long]),"GET", """""", Routes.prefix + """workflow/newLevel/$id<[^/]+>"""))
   }
}
        

// @LINE:42
case controllers_WorkflowController_addSingleComment27(params) => {
   call(params.fromPath[Long]("wid", None), params.fromPath[Long]("lid", None)) { (wid, lid) =>
        invokeHandler(controllers.WorkflowController.addSingleComment(wid, lid), HandlerDef(this, "controllers.WorkflowController", "addSingleComment", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """workflow/newComment/$wid<[^/]+>/$lid<[^/]+>"""))
   }
}
        

// @LINE:44
case controllers_WorkflowController_workflowsByTopViewCount28(params) => {
   call { 
        invokeHandler(controllers.WorkflowController.workflowsByTopViewCount(), HandlerDef(this, "controllers.WorkflowController", "workflowsByTopViewCount", Nil,"GET", """""", Routes.prefix + """workflow/getTop10WorkflowsByViewCount"""))
   }
}
        

// @LINE:47
case controllers_TagController_home29(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.TagController.home(email, vfile, dataset), HandlerDef(this, "controllers.TagController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Tag Model""", Routes.prefix + """tag"""))
   }
}
        

// @LINE:48
case controllers_TagController_tags30(params) => {
   call { 
        invokeHandler(controllers.TagController.tags(), HandlerDef(this, "controllers.TagController", "tags", Nil,"GET", """""", Routes.prefix + """tag/tags"""))
   }
}
        

// @LINE:49
case controllers_TagController_oneService31(params) => {
   call(params.fromQuery[String]("url", Some(null))) { (url) =>
        invokeHandler(controllers.TagController.oneService(url), HandlerDef(this, "controllers.TagController", "oneService", Seq(classOf[String]),"GET", """""", Routes.prefix + """tag/oneService"""))
   }
}
        

// @LINE:50
case controllers_TagController_tagCloud32(params) => {
   call { 
        invokeHandler(controllers.TagController.tagCloud(), HandlerDef(this, "controllers.TagController", "tagCloud", Nil,"GET", """""", Routes.prefix + """tag/tagCloud"""))
   }
}
        

// @LINE:54
case controllers_DatasetController_datasetList33(params) => {
   call { 
        invokeHandler(controllers.DatasetController.datasetList(), HandlerDef(this, "controllers.DatasetController", "datasetList", Nil,"GET", """Keyword search""", Routes.prefix + """climate/datasets"""))
   }
}
        

// @LINE:55
case controllers_DatasetController_searchDataset34(params) => {
   call { 
        invokeHandler(controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Nil,"GET", """""", Routes.prefix + """climate/searchDataSet"""))
   }
}
        

// @LINE:56
case controllers_DatasetController_getSearchResult35(params) => {
   call { 
        invokeHandler(controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Nil,"GET", """""", Routes.prefix + """climate/getSearchResult"""))
   }
}
        

// @LINE:59
case controllers_Assets_at36(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:62
case controllers_UserController_profile37(params) => {
   call { 
        invokeHandler(controllers.UserController.profile(), HandlerDef(this, "controllers.UserController", "profile", Nil,"GET", """User Profiles""", Routes.prefix + """users/myProfile"""))
   }
}
        

// @LINE:63
case controllers_UserController_allUsers38(params) => {
   call { 
        invokeHandler(controllers.UserController.allUsers(), HandlerDef(this, "controllers.UserController", "allUsers", Nil,"GET", """""", Routes.prefix + """users/allUsers"""))
   }
}
        

// @LINE:64
case controllers_UserController_signUpForm39(params) => {
   call { 
        invokeHandler(controllers.UserController.signUpForm(), HandlerDef(this, "controllers.UserController", "signUpForm", Nil,"GET", """""", Routes.prefix + """users/signUpForm"""))
   }
}
        

// @LINE:65
case controllers_UserController_signUp40(params) => {
   call { 
        invokeHandler(controllers.UserController.signUp(), HandlerDef(this, "controllers.UserController", "signUp", Nil,"GET", """""", Routes.prefix + """users/signUp"""))
   }
}
        

// @LINE:66
case controllers_UserController_signInForm41(params) => {
   call { 
        invokeHandler(controllers.UserController.signInForm(), HandlerDef(this, "controllers.UserController", "signInForm", Nil,"GET", """""", Routes.prefix + """users/signInForm"""))
   }
}
        

// @LINE:67
case controllers_UserController_signIn42(params) => {
   call { 
        invokeHandler(controllers.UserController.signIn(), HandlerDef(this, "controllers.UserController", "signIn", Nil,"GET", """""", Routes.prefix + """users/signIn"""))
   }
}
        

// @LINE:68
case controllers_UserController_signOut43(params) => {
   call { 
        invokeHandler(controllers.UserController.signOut(), HandlerDef(this, "controllers.UserController", "signOut", Nil,"GET", """""", Routes.prefix + """users/signOut"""))
   }
}
        

// @LINE:69
case controllers_UserController_showFriends44(params) => {
   call { 
        invokeHandler(controllers.UserController.showFriends(), HandlerDef(this, "controllers.UserController", "showFriends", Nil,"GET", """""", Routes.prefix + """users/friends"""))
   }
}
        

// @LINE:70
case controllers_UserController_addFriend45(params) => {
   call(params.fromQuery[Long]("userId", None), params.fromQuery[Boolean]("isSubscribe", None)) { (userId, isSubscribe) =>
        invokeHandler(controllers.UserController.addFriend(userId, isSubscribe), HandlerDef(this, "controllers.UserController", "addFriend", Seq(classOf[Long], classOf[Boolean]),"GET", """""", Routes.prefix + """users/addfriend"""))
   }
}
        

// @LINE:71
case controllers_UserController_deleteFriend46(params) => {
   call(params.fromQuery[Long]("userId", None), params.fromQuery[Boolean]("isSubscribe", None)) { (userId, isSubscribe) =>
        invokeHandler(controllers.UserController.deleteFriend(userId, isSubscribe), HandlerDef(this, "controllers.UserController", "deleteFriend", Seq(classOf[Long], classOf[Boolean]),"GET", """""", Routes.prefix + """users/deletefriend"""))
   }
}
        

// @LINE:72
case controllers_UserController_addSubscribe47(params) => {
   call(params.fromQuery[Long]("userId", None), params.fromQuery[Boolean]("isFriend", None)) { (userId, isFriend) =>
        invokeHandler(controllers.UserController.addSubscribe(userId, isFriend), HandlerDef(this, "controllers.UserController", "addSubscribe", Seq(classOf[Long], classOf[Boolean]),"GET", """""", Routes.prefix + """users/addSubscribe"""))
   }
}
        

// @LINE:73
case controllers_UserController_deleteSubscribe48(params) => {
   call(params.fromQuery[Long]("userId", None), params.fromQuery[Boolean]("isFriend", None)) { (userId, isFriend) =>
        invokeHandler(controllers.UserController.deleteSubscribe(userId, isFriend), HandlerDef(this, "controllers.UserController", "deleteSubscribe", Seq(classOf[Long], classOf[Boolean]),"GET", """""", Routes.prefix + """users/deleteSubscribe"""))
   }
}
        

// @LINE:74
case controllers_UserController_showSubscriptions49(params) => {
   call { 
        invokeHandler(controllers.UserController.showSubscriptions(), HandlerDef(this, "controllers.UserController", "showSubscriptions", Nil,"GET", """""", Routes.prefix + """users/subscriptions"""))
   }
}
        

// @LINE:75
case controllers_UserController_oneUser50(params) => {
   call(params.fromPath[Long]("userId", None)) { (userId) =>
        invokeHandler(controllers.UserController.oneUser(userId), HandlerDef(this, "controllers.UserController", "oneUser", Seq(classOf[Long]),"GET", """""", Routes.prefix + """users/account/$userId<[^/]+>"""))
   }
}
        

// @LINE:76
case controllers_UserGroupController_showGroups51(params) => {
   call { 
        invokeHandler(controllers.UserGroupController.showGroups(), HandlerDef(this, "controllers.UserGroupController", "showGroups", Nil,"GET", """""", Routes.prefix + """usergroups/all"""))
   }
}
        

// @LINE:77
case controllers_UserGroupController_newGroup52(params) => {
   call { 
        invokeHandler(controllers.UserGroupController.newGroup(), HandlerDef(this, "controllers.UserGroupController", "newGroup", Nil,"GET", """""", Routes.prefix + """usergroups/addGroup"""))
   }
}
        

// @LINE:78
case controllers_UserGroupController_newGroupForm53(params) => {
   call { 
        invokeHandler(controllers.UserGroupController.newGroupForm(), HandlerDef(this, "controllers.UserGroupController", "newGroupForm", Nil,"GET", """""", Routes.prefix + """usergroups/addGroupForm"""))
   }
}
        

// @LINE:79
case controllers_UserGroupController_oneGroup54(params) => {
   call(params.fromPath[Long]("userGroupId", None)) { (userGroupId) =>
        invokeHandler(controllers.UserGroupController.oneGroup(userGroupId), HandlerDef(this, "controllers.UserGroupController", "oneGroup", Seq(classOf[Long]),"GET", """""", Routes.prefix + """usergroups/$userGroupId<[^/]+>"""))
   }
}
        
}

}
     