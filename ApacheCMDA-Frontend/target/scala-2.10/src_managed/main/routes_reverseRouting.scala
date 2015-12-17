// @SOURCE:/home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/conf/routes
// @HASH:1d970e49c30fbdf1edecf862208ab7aab7d5ee9e
// @DATE:Fri Dec 11 08:39:54 UTC 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:7
// @LINE:6
package controllers {

// @LINE:59
class ReverseAssets {
    

// @LINE:59
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
class ReverseTagController {
    

// @LINE:50
def tagCloud(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag/tagCloud")
}
                                                

// @LINE:49
def oneService(url:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag/oneService" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)))))
}
                                                

// @LINE:48
def tags(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag/tags")
}
                                                

// @LINE:47
def home(email:String = null, vfile:String = null, dataset:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
class ReverseAboutusController {
    

// @LINE:19
def aboutProject(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutProject")
}
                                                

// @LINE:18
def aboutUs(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutus")
}
                                                
    
}
                          

// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
class ReverseWorkflowController {
    

// @LINE:42
def addSingleComment(wid:Long, lid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/newComment/" + implicitly[PathBindable[Long]].unbind("wid", wid) + "/" + implicitly[PathBindable[Long]].unbind("lid", lid))
}
                                                

// @LINE:40
def displayWorkflow(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/disWorkflow" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:37
def workflows(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflows")
}
                                                

// @LINE:44
def workflowsByTopViewCount(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getTop10WorkflowsByViewCount")
}
                                                

// @LINE:41
def addLevelComment(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/newLevel/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:36
def createWorkflow(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/createWorkflow")
}
                                                

// @LINE:38
def handleCreateWorkflow(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "workflow/workflowCreating")
}
                                                

// @LINE:39
def linkTags(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/linkTags")
}
                                                
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseBugReportController {
    

// @LINE:11
def reports(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bugs")
}
                                                

// @LINE:15
def solveReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "solve/report")
}
                                                

// @LINE:14
def deleteReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete/report")
}
                                                

// @LINE:13
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bug/list")
}
                                                

// @LINE:12
def newReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newReport")
}
                                                
    
}
                          

// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
class ReverseUserGroupController {
    

// @LINE:77
def newGroup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usergroups/addGroup")
}
                                                

// @LINE:79
def oneGroup(userGroupId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usergroups/" + implicitly[PathBindable[Long]].unbind("userGroupId", userGroupId))
}
                                                

// @LINE:78
def newGroupForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usergroups/addGroupForm")
}
                                                

// @LINE:76
def showGroups(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "usergroups/all")
}
                                                
    
}
                          

// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
class ReverseUserController {
    

// @LINE:65
def signUp(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/signUp")
}
                                                

// @LINE:64
def signUpForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/signUpForm")
}
                                                

// @LINE:73
def deleteSubscribe(userId:Long, isFriend:Boolean): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/deleteSubscribe" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("userId", userId)), Some(implicitly[QueryStringBindable[Boolean]].unbind("isFriend", isFriend)))))
}
                                                

// @LINE:69
def showFriends(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/friends")
}
                                                

// @LINE:62
def profile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/myProfile")
}
                                                

// @LINE:74
def showSubscriptions(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/subscriptions")
}
                                                

// @LINE:68
def signOut(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/signOut")
}
                                                

// @LINE:75
def oneUser(userId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/account/" + implicitly[PathBindable[Long]].unbind("userId", userId))
}
                                                

// @LINE:66
def signInForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/signInForm")
}
                                                

// @LINE:71
def deleteFriend(userId:Long, isSubscribe:Boolean): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/deletefriend" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("userId", userId)), Some(implicitly[QueryStringBindable[Boolean]].unbind("isSubscribe", isSubscribe)))))
}
                                                

// @LINE:63
def allUsers(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/allUsers")
}
                                                

// @LINE:70
def addFriend(userId:Long, isSubscribe:Boolean): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/addfriend" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("userId", userId)), Some(implicitly[QueryStringBindable[Boolean]].unbind("isSubscribe", isSubscribe)))))
}
                                                

// @LINE:72
def addSubscribe(userId:Long, isFriend:Boolean): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/addSubscribe" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("userId", userId)), Some(implicitly[QueryStringBindable[Boolean]].unbind("isFriend", isFriend)))))
}
                                                

// @LINE:67
def signIn(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/signIn")
}
                                                
    
}
                          

// @LINE:56
// @LINE:55
// @LINE:54
class ReverseDatasetController {
    

// @LINE:56
def getSearchResult(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/getSearchResult")
}
                                                

// @LINE:55
def searchDataset(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/searchDataSet")
}
                                                

// @LINE:54
def datasetList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/datasets")
}
                                                
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:32
def addClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/new/climateServices")
}
                                                

// @LINE:25
def mostRecentlyAddedClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostRecentlyAddedClimateServices")
}
                                                

// @LINE:31
def editClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/edit/climateServices")
}
                                                

// @LINE:27
def mostPopularClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostPopularClimateServices")
}
                                                

// @LINE:23
def tutorial(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/tutorial")
}
                                                

// @LINE:33
def oneService(url:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/oneService" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)))))
}
                                                

// @LINE:30
def downloadClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/download/climateServices")
}
                                                

// @LINE:26
def mostRecentlyUsedClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostRecentlyUsedClimateServices")
}
                                                

// @LINE:24
def climateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/climateServices")
}
                                                

// @LINE:28
def newClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/new/climateServices")
}
                                                

// @LINE:22
// @LINE:7
// @LINE:6
def home(email:String = null, vfile:String = null, dataset:String = null): Call = {
   (email: @unchecked, vfile: @unchecked, dataset: @unchecked) match {
// @LINE:6
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "home" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
// @LINE:7
case (email, vfile, dataset) if true => Call("GET", _prefix + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
// @LINE:22
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "climate" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
   }
}
                                                

// @LINE:29
def deleteClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/delete/climateServices")
}
                                                
    
}
                          
}
                  


// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:59
class ReverseAssets {
    

// @LINE:59
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
class ReverseTagController {
    

// @LINE:50
def tagCloud : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.tagCloud",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/tagCloud"})
      }
   """
)
                        

// @LINE:49
def oneService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.oneService",
   """
      function(url) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/oneService" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url))])})
      }
   """
)
                        

// @LINE:48
def tags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.tags",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/tags"})
      }
   """
)
                        

// @LINE:47
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.home",
   """
      function(email,vfile,dataset) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:18
class ReverseAboutusController {
    

// @LINE:19
def aboutProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutProject",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutProject"})
      }
   """
)
                        

// @LINE:18
def aboutUs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutUs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
      }
   """
)
                        
    
}
              

// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
class ReverseWorkflowController {
    

// @LINE:42
def addSingleComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.addSingleComment",
   """
      function(wid,lid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/newComment/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wid", wid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("lid", lid)})
      }
   """
)
                        

// @LINE:40
def displayWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.displayWorkflow",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/disWorkflow" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:37
def workflows : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.workflows",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflows"})
      }
   """
)
                        

// @LINE:44
def workflowsByTopViewCount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.workflowsByTopViewCount",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getTop10WorkflowsByViewCount"})
      }
   """
)
                        

// @LINE:41
def addLevelComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.addLevelComment",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/newLevel/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:36
def createWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.createWorkflow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/createWorkflow"})
      }
   """
)
                        

// @LINE:38
def handleCreateWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.handleCreateWorkflow",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/workflowCreating"})
      }
   """
)
                        

// @LINE:39
def linkTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.linkTags",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/linkTags"})
      }
   """
)
                        
    
}
              

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseBugReportController {
    

// @LINE:11
def reports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.reports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugs"})
      }
   """
)
                        

// @LINE:15
def solveReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.solveReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solve/report"})
      }
   """
)
                        

// @LINE:14
def deleteReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.deleteReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/report"})
      }
   """
)
                        

// @LINE:13
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bug/list"})
      }
   """
)
                        

// @LINE:12
def newReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.newReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newReport"})
      }
   """
)
                        
    
}
              

// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
class ReverseUserGroupController {
    

// @LINE:77
def newGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserGroupController.newGroup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usergroups/addGroup"})
      }
   """
)
                        

// @LINE:79
def oneGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserGroupController.oneGroup",
   """
      function(userGroupId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usergroups/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userGroupId", userGroupId)})
      }
   """
)
                        

// @LINE:78
def newGroupForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserGroupController.newGroupForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usergroups/addGroupForm"})
      }
   """
)
                        

// @LINE:76
def showGroups : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserGroupController.showGroups",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usergroups/all"})
      }
   """
)
                        
    
}
              

// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
class ReverseUserController {
    

// @LINE:65
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.signUp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signUp"})
      }
   """
)
                        

// @LINE:64
def signUpForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.signUpForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signUpForm"})
      }
   """
)
                        

// @LINE:73
def deleteSubscribe : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteSubscribe",
   """
      function(userId,isFriend) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/deleteSubscribe" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("userId", userId), (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("isFriend", isFriend)])})
      }
   """
)
                        

// @LINE:69
def showFriends : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.showFriends",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/friends"})
      }
   """
)
                        

// @LINE:62
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/myProfile"})
      }
   """
)
                        

// @LINE:74
def showSubscriptions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.showSubscriptions",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/subscriptions"})
      }
   """
)
                        

// @LINE:68
def signOut : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.signOut",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signOut"})
      }
   """
)
                        

// @LINE:75
def oneUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.oneUser",
   """
      function(userId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/account/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId)})
      }
   """
)
                        

// @LINE:66
def signInForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.signInForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signInForm"})
      }
   """
)
                        

// @LINE:71
def deleteFriend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteFriend",
   """
      function(userId,isSubscribe) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/deletefriend" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("userId", userId), (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("isSubscribe", isSubscribe)])})
      }
   """
)
                        

// @LINE:63
def allUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.allUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/allUsers"})
      }
   """
)
                        

// @LINE:70
def addFriend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.addFriend",
   """
      function(userId,isSubscribe) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/addfriend" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("userId", userId), (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("isSubscribe", isSubscribe)])})
      }
   """
)
                        

// @LINE:72
def addSubscribe : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.addSubscribe",
   """
      function(userId,isFriend) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/addSubscribe" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("userId", userId), (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("isFriend", isFriend)])})
      }
   """
)
                        

// @LINE:67
def signIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.signIn",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/signIn"})
      }
   """
)
                        
    
}
              

// @LINE:56
// @LINE:55
// @LINE:54
class ReverseDatasetController {
    

// @LINE:56
def getSearchResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getSearchResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/getSearchResult"})
      }
   """
)
                        

// @LINE:55
def searchDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.searchDataset",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/searchDataSet"})
      }
   """
)
                        

// @LINE:54
def datasetList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.datasetList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/datasets"})
      }
   """
)
                        
    
}
              

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:32
def addClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/new/climateServices"})
      }
   """
)
                        

// @LINE:25
def mostRecentlyAddedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyAddedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostRecentlyAddedClimateServices"})
      }
   """
)
                        

// @LINE:31
def editClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.editClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/edit/climateServices"})
      }
   """
)
                        

// @LINE:27
def mostPopularClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostPopularClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostPopularClimateServices"})
      }
   """
)
                        

// @LINE:23
def tutorial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.tutorial",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/tutorial"})
      }
   """
)
                        

// @LINE:33
def oneService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.oneService",
   """
      function(url) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/oneService" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url))])})
      }
   """
)
                        

// @LINE:30
def downloadClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.downloadClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/download/climateServices"})
      }
   """
)
                        

// @LINE:26
def mostRecentlyUsedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyUsedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostRecentlyUsedClimateServices"})
      }
   """
)
                        

// @LINE:24
def climateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.climateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/climateServices"})
      }
   """
)
                        

// @LINE:28
def newClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.newClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/new/climateServices"})
      }
   """
)
                        

// @LINE:22
// @LINE:7
// @LINE:6
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.home",
   """
      function(email, vfile, dataset) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      }
   """
)
                        

// @LINE:29
def deleteClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/delete/climateServices"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:59
class ReverseAssets {
    

// @LINE:59
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
class ReverseTagController {
    

// @LINE:50
def tagCloud(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TagController.tagCloud(), HandlerDef(this, "controllers.TagController", "tagCloud", Seq(), "GET", """""", _prefix + """tag/tagCloud""")
)
                      

// @LINE:49
def oneService(url:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TagController.oneService(url), HandlerDef(this, "controllers.TagController", "oneService", Seq(classOf[String]), "GET", """""", _prefix + """tag/oneService""")
)
                      

// @LINE:48
def tags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TagController.tags(), HandlerDef(this, "controllers.TagController", "tags", Seq(), "GET", """""", _prefix + """tag/tags""")
)
                      

// @LINE:47
def home(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TagController.home(email, vfile, dataset), HandlerDef(this, "controllers.TagController", "home", Seq(classOf[String], classOf[String], classOf[String]), "GET", """ Tag Model""", _prefix + """tag""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
class ReverseAboutusController {
    

// @LINE:19
def aboutProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutProject(), HandlerDef(this, "controllers.AboutusController", "aboutProject", Seq(), "GET", """""", _prefix + """aboutProject""")
)
                      

// @LINE:18
def aboutUs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutUs(), HandlerDef(this, "controllers.AboutusController", "aboutUs", Seq(), "GET", """ About Us""", _prefix + """aboutus""")
)
                      
    
}
                          

// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
class ReverseWorkflowController {
    

// @LINE:42
def addSingleComment(wid:Long, lid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.addSingleComment(wid, lid), HandlerDef(this, "controllers.WorkflowController", "addSingleComment", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """workflow/newComment/$wid<[^/]+>/$lid<[^/]+>""")
)
                      

// @LINE:40
def displayWorkflow(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.displayWorkflow(id), HandlerDef(this, "controllers.WorkflowController", "displayWorkflow", Seq(classOf[Long]), "GET", """""", _prefix + """workflow/disWorkflow""")
)
                      

// @LINE:37
def workflows(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.workflows(), HandlerDef(this, "controllers.WorkflowController", "workflows", Seq(), "GET", """""", _prefix + """workflows""")
)
                      

// @LINE:44
def workflowsByTopViewCount(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.workflowsByTopViewCount(), HandlerDef(this, "controllers.WorkflowController", "workflowsByTopViewCount", Seq(), "GET", """""", _prefix + """workflow/getTop10WorkflowsByViewCount""")
)
                      

// @LINE:41
def addLevelComment(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.addLevelComment(id), HandlerDef(this, "controllers.WorkflowController", "addLevelComment", Seq(classOf[Long]), "GET", """""", _prefix + """workflow/newLevel/$id<[^/]+>""")
)
                      

// @LINE:36
def createWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.createWorkflow(), HandlerDef(this, "controllers.WorkflowController", "createWorkflow", Seq(), "GET", """Workflow""", _prefix + """workflow/createWorkflow""")
)
                      

// @LINE:38
def handleCreateWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.handleCreateWorkflow(), HandlerDef(this, "controllers.WorkflowController", "handleCreateWorkflow", Seq(), "POST", """""", _prefix + """workflow/workflowCreating""")
)
                      

// @LINE:39
def linkTags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.linkTags(), HandlerDef(this, "controllers.WorkflowController", "linkTags", Seq(), "GET", """""", _prefix + """workflow/linkTags""")
)
                      
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseBugReportController {
    

// @LINE:11
def reports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Seq(), "GET", """ BugReporting""", _prefix + """bugs""")
)
                      

// @LINE:15
def solveReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Seq(), "POST", """""", _prefix + """solve/report""")
)
                      

// @LINE:14
def deleteReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Seq(), "POST", """""", _prefix + """delete/report""")
)
                      

// @LINE:13
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Seq(), "GET", """""", _prefix + """bug/list""")
)
                      

// @LINE:12
def newReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Seq(), "GET", """""", _prefix + """newReport""")
)
                      
    
}
                          

// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
class ReverseUserGroupController {
    

// @LINE:77
def newGroup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserGroupController.newGroup(), HandlerDef(this, "controllers.UserGroupController", "newGroup", Seq(), "GET", """""", _prefix + """usergroups/addGroup""")
)
                      

// @LINE:79
def oneGroup(userGroupId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserGroupController.oneGroup(userGroupId), HandlerDef(this, "controllers.UserGroupController", "oneGroup", Seq(classOf[Long]), "GET", """""", _prefix + """usergroups/$userGroupId<[^/]+>""")
)
                      

// @LINE:78
def newGroupForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserGroupController.newGroupForm(), HandlerDef(this, "controllers.UserGroupController", "newGroupForm", Seq(), "GET", """""", _prefix + """usergroups/addGroupForm""")
)
                      

// @LINE:76
def showGroups(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserGroupController.showGroups(), HandlerDef(this, "controllers.UserGroupController", "showGroups", Seq(), "GET", """""", _prefix + """usergroups/all""")
)
                      
    
}
                          

// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
class ReverseUserController {
    

// @LINE:65
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.signUp(), HandlerDef(this, "controllers.UserController", "signUp", Seq(), "GET", """""", _prefix + """users/signUp""")
)
                      

// @LINE:64
def signUpForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.signUpForm(), HandlerDef(this, "controllers.UserController", "signUpForm", Seq(), "GET", """""", _prefix + """users/signUpForm""")
)
                      

// @LINE:73
def deleteSubscribe(userId:Long, isFriend:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.deleteSubscribe(userId, isFriend), HandlerDef(this, "controllers.UserController", "deleteSubscribe", Seq(classOf[Long], classOf[Boolean]), "GET", """""", _prefix + """users/deleteSubscribe""")
)
                      

// @LINE:69
def showFriends(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.showFriends(), HandlerDef(this, "controllers.UserController", "showFriends", Seq(), "GET", """""", _prefix + """users/friends""")
)
                      

// @LINE:62
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.profile(), HandlerDef(this, "controllers.UserController", "profile", Seq(), "GET", """User Profiles""", _prefix + """users/myProfile""")
)
                      

// @LINE:74
def showSubscriptions(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.showSubscriptions(), HandlerDef(this, "controllers.UserController", "showSubscriptions", Seq(), "GET", """""", _prefix + """users/subscriptions""")
)
                      

// @LINE:68
def signOut(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.signOut(), HandlerDef(this, "controllers.UserController", "signOut", Seq(), "GET", """""", _prefix + """users/signOut""")
)
                      

// @LINE:75
def oneUser(userId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.oneUser(userId), HandlerDef(this, "controllers.UserController", "oneUser", Seq(classOf[Long]), "GET", """""", _prefix + """users/account/$userId<[^/]+>""")
)
                      

// @LINE:66
def signInForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.signInForm(), HandlerDef(this, "controllers.UserController", "signInForm", Seq(), "GET", """""", _prefix + """users/signInForm""")
)
                      

// @LINE:71
def deleteFriend(userId:Long, isSubscribe:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.deleteFriend(userId, isSubscribe), HandlerDef(this, "controllers.UserController", "deleteFriend", Seq(classOf[Long], classOf[Boolean]), "GET", """""", _prefix + """users/deletefriend""")
)
                      

// @LINE:63
def allUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.allUsers(), HandlerDef(this, "controllers.UserController", "allUsers", Seq(), "GET", """""", _prefix + """users/allUsers""")
)
                      

// @LINE:70
def addFriend(userId:Long, isSubscribe:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.addFriend(userId, isSubscribe), HandlerDef(this, "controllers.UserController", "addFriend", Seq(classOf[Long], classOf[Boolean]), "GET", """""", _prefix + """users/addfriend""")
)
                      

// @LINE:72
def addSubscribe(userId:Long, isFriend:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.addSubscribe(userId, isFriend), HandlerDef(this, "controllers.UserController", "addSubscribe", Seq(classOf[Long], classOf[Boolean]), "GET", """""", _prefix + """users/addSubscribe""")
)
                      

// @LINE:67
def signIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.signIn(), HandlerDef(this, "controllers.UserController", "signIn", Seq(), "GET", """""", _prefix + """users/signIn""")
)
                      
    
}
                          

// @LINE:56
// @LINE:55
// @LINE:54
class ReverseDatasetController {
    

// @LINE:56
def getSearchResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Seq(), "GET", """""", _prefix + """climate/getSearchResult""")
)
                      

// @LINE:55
def searchDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Seq(), "GET", """""", _prefix + """climate/searchDataSet""")
)
                      

// @LINE:54
def datasetList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.datasetList(), HandlerDef(this, "controllers.DatasetController", "datasetList", Seq(), "GET", """Keyword search""", _prefix + """climate/datasets""")
)
                      
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:32
def addClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Seq(), "GET", """""", _prefix + """climate/new/climateServices""")
)
                      

// @LINE:25
def mostRecentlyAddedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Seq(), "GET", """""", _prefix + """climate/mostRecentlyAddedClimateServices""")
)
                      

// @LINE:31
def editClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Seq(), "POST", """""", _prefix + """climate/edit/climateServices""")
)
                      

// @LINE:27
def mostPopularClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostPopularClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Seq(), "GET", """""", _prefix + """climate/mostPopularClimateServices""")
)
                      

// @LINE:23
def tutorial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Seq(), "GET", """""", _prefix + """climate/tutorial""")
)
                      

// @LINE:33
def oneService(url:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.oneService(url), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String]), "GET", """""", _prefix + """climate/oneService""")
)
                      

// @LINE:30
def downloadClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Seq(), "POST", """""", _prefix + """climate/download/climateServices""")
)
                      

// @LINE:26
def mostRecentlyUsedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Seq(), "GET", """""", _prefix + """climate/mostRecentlyUsedClimateServices""")
)
                      

// @LINE:24
def climateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.climateServices(), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Seq(), "GET", """""", _prefix + """climate/climateServices""")
)
                      

// @LINE:28
def newClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Seq(), "POST", """""", _prefix + """climate/new/climateServices""")
)
                      

// @LINE:6
def home(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]), "GET", """ Home page""", _prefix + """home""")
)
                      

// @LINE:29
def deleteClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Seq(), "POST", """""", _prefix + """climate/delete/climateServices""")
)
                      
    
}
                          
}
        
    