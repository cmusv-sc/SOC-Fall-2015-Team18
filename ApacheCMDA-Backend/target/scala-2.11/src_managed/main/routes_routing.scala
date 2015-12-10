// @SOURCE:/home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Backend/conf/routes
// @HASH:85296ae3a79c9d88d93196e62ccc160e751446a6
// @DATE:Fri Dec 04 02:39:46 UTC 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:10
private[this] lazy val controllers_ClimateServiceController_getClimateService0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getClimateService/"),DynamicPart("name", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ClimateServiceController_getClimateService0_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateService(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateService", Seq(classOf[String], classOf[String]),"GET", """ Climate Service""", Routes.prefix + """climateService/getClimateService/$name<[^/]+>/json"""))
        

// @LINE:11
private[this] lazy val controllers_ClimateServiceController_getClimateServiceById1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getClimateService/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_getClimateServiceById1_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateServiceById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateServiceById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """climateService/getClimateService/id/$id<[^/]+>"""))
        

// @LINE:12
private[this] lazy val controllers_ClimateServiceController_getAllClimateServices2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllClimateServices/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServices2_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServices(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServices", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllClimateServices/json"""))
        

// @LINE:13
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllMostRecentClimateServicesByCreateTime/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCreateTime(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCreateTime", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllMostRecentClimateServicesByCreateTime/json"""))
        

// @LINE:14
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllMostRecentClimateServicesByLatestAccessTime/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByLatestAccessTime(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByLatestAccessTime", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllMostRecentClimateServicesByLatestAccessTime/json"""))
        

// @LINE:15
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllMostUsedClimateServices/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCount(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCount", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllMostUsedClimateServices/json"""))
        

// @LINE:16
private[this] lazy val controllers_ClimateServiceController_addClimateService6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/addClimateService"))))
private[this] lazy val controllers_ClimateServiceController_addClimateService6_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addClimateService,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addClimateService", Nil,"POST", """""", Routes.prefix + """climateService/addClimateService"""))
        

// @LINE:17
private[this] lazy val controllers_ClimateServiceController_getAllServiceEntries7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllServiceEntries/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllServiceEntries7_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllServiceEntries(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllServiceEntries", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllServiceEntries/json"""))
        

// @LINE:18
private[this] lazy val controllers_ClimateServiceController_addServiceEntry8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/addServiceEntry"))))
private[this] lazy val controllers_ClimateServiceController_addServiceEntry8_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addServiceEntry,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addServiceEntry", Nil,"POST", """""", Routes.prefix + """climateService/addServiceEntry"""))
        

// @LINE:19
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceById9_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/updateClimateService/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceById9_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """climateService/updateClimateService/id/$id<[^/]+>"""))
        

// @LINE:20
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceByName10_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/updateClimateService/name/"),DynamicPart("oldName", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceByName10_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceByName(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceByName", Seq(classOf[String]),"PUT", """""", Routes.prefix + """climateService/updateClimateService/name/$oldName<[^/]+>"""))
        

// @LINE:21
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceById11_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/deleteClimateService/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceById11_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceById", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """climateService/deleteClimateService/id/$id<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceByName12_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/deleteClimateService/name/"),DynamicPart("name", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceByName12_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceByName(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceByName", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """climateService/deleteClimateService/name/$name<[^/]+>"""))
        

// @LINE:25
private[this] lazy val controllers_InstrumentController_getAllInstruments13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/getAllInstruments/json"))))
private[this] lazy val controllers_InstrumentController_getAllInstruments13_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getAllInstruments(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getAllInstruments", Seq(classOf[String]),"GET", """ Instrument""", Routes.prefix + """instrument/getAllInstruments/json"""))
        

// @LINE:26
private[this] lazy val controllers_InstrumentController_getInstrument14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/getInstrument/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_InstrumentController_getInstrument14_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getInstrument(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getInstrument", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """instrument/getInstrument/id/$id<[^/]+>/json"""))
        

// @LINE:27
private[this] lazy val controllers_InstrumentController_addInstrument15_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/addInstrument"))))
private[this] lazy val controllers_InstrumentController_addInstrument15_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).addInstrument,
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "addInstrument", Nil,"POST", """""", Routes.prefix + """instrument/addInstrument"""))
        

// @LINE:28
private[this] lazy val controllers_InstrumentController_updateInstrumentById16_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/updateInstrument/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_InstrumentController_updateInstrumentById16_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).updateInstrumentById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "updateInstrumentById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """instrument/updateInstrument/id/$id<[^/]+>"""))
        

// @LINE:29
private[this] lazy val controllers_InstrumentController_deleteInstrument17_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/deleteInstrument/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_InstrumentController_deleteInstrument17_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).deleteInstrument(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "deleteInstrument", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """instrument/deleteInstrument/id/$id<[^/]+>"""))
        

// @LINE:32
private[this] lazy val controllers_DatasetController_getAllDatasets18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/getAllDatasets/json"))))
private[this] lazy val controllers_DatasetController_getAllDatasets18_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getAllDatasets(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getAllDatasets", Seq(classOf[String]),"GET", """ Dataset""", Routes.prefix + """dataset/getAllDatasets/json"""))
        

// @LINE:33
private[this] lazy val controllers_DatasetController_getDataset19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/getDataset/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_DatasetController_getDataset19_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getDataset(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getDataset", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """dataset/getDataset/id/$id<[^/]+>/json"""))
        

// @LINE:34
private[this] lazy val controllers_DatasetController_addDataset20_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/addDataset"))))
private[this] lazy val controllers_DatasetController_addDataset20_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).addDataset,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "addDataset", Nil,"POST", """""", Routes.prefix + """dataset/addDataset"""))
        

// @LINE:35
private[this] lazy val controllers_DatasetController_updateDatasetById21_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/updateDataset/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_DatasetController_updateDatasetById21_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).updateDatasetById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "updateDatasetById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """dataset/updateDataset/id/$id<[^/]+>"""))
        

// @LINE:36
private[this] lazy val controllers_DatasetController_deleteDataset22_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/deleteDataset/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_DatasetController_deleteDataset22_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).deleteDataset(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "deleteDataset", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """dataset/deleteDataset/id/$id<[^/]+>"""))
        

// @LINE:37
private[this] lazy val controllers_DatasetController_queryDatasets23_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/queryDataset"))))
private[this] lazy val controllers_DatasetController_queryDatasets23_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).queryDatasets,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "queryDatasets", Nil,"POST", """""", Routes.prefix + """dataset/queryDataset"""))
        

// @LINE:40
private[this] lazy val controllers_ParameterController_getAllParameters24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/getAllParameters/json"))))
private[this] lazy val controllers_ParameterController_getAllParameters24_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getAllParameters(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getAllParameters", Seq(classOf[String]),"GET", """ Parameter""", Routes.prefix + """parameter/getAllParameters/json"""))
        

// @LINE:41
private[this] lazy val controllers_ParameterController_getParameterByName25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/getParameter/service/"),DynamicPart("id", """[^/]+""",true),StaticPart("/name/"),DynamicPart("name", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ParameterController_getParameterByName25_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterByName(fakeValue[Long], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterByName", Seq(classOf[Long], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """parameter/getParameter/service/$id<[^/]+>/name/$name<[^/]+>/json"""))
        

// @LINE:42
private[this] lazy val controllers_ParameterController_getParameterById26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/getParameter/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ParameterController_getParameterById26_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterById(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterById", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """parameter/getParameter/id/$id<[^/]+>/json"""))
        

// @LINE:43
private[this] lazy val controllers_ParameterController_addParameter27_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/addParameter"))))
private[this] lazy val controllers_ParameterController_addParameter27_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).addParameter,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "addParameter", Nil,"POST", """""", Routes.prefix + """parameter/addParameter"""))
        

// @LINE:44
private[this] lazy val controllers_ParameterController_updateParameterById28_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/updateParameter/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ParameterController_updateParameterById28_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """parameter/updateParameter/id/$id<[^/]+>"""))
        

// @LINE:45
private[this] lazy val controllers_ParameterController_updateParameterByName29_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/updateParameter/name/"),DynamicPart("oldName", """[^/]+""",true))))
private[this] lazy val controllers_ParameterController_updateParameterByName29_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterByName(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterByName", Seq(classOf[String]),"PUT", """""", Routes.prefix + """parameter/updateParameter/name/$oldName<[^/]+>"""))
        

// @LINE:46
private[this] lazy val controllers_ParameterController_deleteParameterByName30_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/deleteParameter/service/"),DynamicPart("id", """[^/]+""",true),StaticPart("/name/"),DynamicPart("name", """[^/]+""",true))))
private[this] lazy val controllers_ParameterController_deleteParameterByName30_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).deleteParameterByName(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "deleteParameterByName", Seq(classOf[Long], classOf[String]),"DELETE", """""", Routes.prefix + """parameter/deleteParameter/service/$id<[^/]+>/name/$name<[^/]+>"""))
        

// @LINE:49
private[this] lazy val controllers_UserController_addUser31_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/add"))))
private[this] lazy val controllers_UserController_addUser31_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).addUser,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "addUser", Nil,"POST", """ Users""", Routes.prefix + """users/add"""))
        

// @LINE:50
private[this] lazy val controllers_UserController_updateUser32_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/update/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_updateUser32_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).updateUser(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "updateUser", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """users/update/$id<[^/]+>"""))
        

// @LINE:51
private[this] lazy val controllers_UserController_deleteUser33_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/delete/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_deleteUser33_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUser(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUser", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """users/delete/$id<[^/]+>"""))
        

// @LINE:52
private[this] lazy val controllers_UserController_getAllUsers34_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getAllUsers/json"))))
private[this] lazy val controllers_UserController_getAllUsers34_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllUsers(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getAllUsers", Seq(classOf[String]),"GET", """""", Routes.prefix + """users/getAllUsers/json"""))
        

// @LINE:53
private[this] lazy val controllers_UserController_isUserValid35_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/isUserValid"))))
private[this] lazy val controllers_UserController_isUserValid35_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).isUserValid,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "isUserValid", Nil,"POST", """""", Routes.prefix + """users/isUserValid"""))
        

// @LINE:54
private[this] lazy val controllers_UserController_deleteUserByUserNameAndPassword36_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/delete/userName/"),DynamicPart("userName", """[^/]+""",true),StaticPart("/password/"),DynamicPart("password", """[^/]+""",true))))
private[this] lazy val controllers_UserController_deleteUserByUserNameAndPassword36_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUserByUserNameAndPassword(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUserByUserNameAndPassword", Seq(classOf[String], classOf[String]),"DELETE", """""", Routes.prefix + """users/delete/userName/$userName<[^/]+>/password/$password<[^/]+>"""))
        

// @LINE:55
private[this] lazy val controllers_UserController_getUser37_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_getUser37_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getUser(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getUser", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """users/$id<[^/]+>"""))
        

// @LINE:58
private[this] lazy val controllers_UserGroupController_addUserGroup38_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userGroup/add"))))
private[this] lazy val controllers_UserGroupController_addUserGroup38_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserGroupController]).addUserGroup,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserGroupController", "addUserGroup", Nil,"POST", """ Group""", Routes.prefix + """userGroup/add"""))
        

// @LINE:59
private[this] lazy val controllers_UserGroupController_getAllUsersInGroup39_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userGroup/getAllUsersInGroup/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserGroupController_getAllUsersInGroup39_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserGroupController]).getAllUsersInGroup(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserGroupController", "getAllUsersInGroup", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """userGroup/getAllUsersInGroup/$id<[^/]+>"""))
        

// @LINE:60
private[this] lazy val controllers_UserGroupController_getAllUserGroup40_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userGroup/getAllUserGroup/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserGroupController_getAllUserGroup40_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserGroupController]).getAllUserGroup(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserGroupController", "getAllUserGroup", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """userGroup/getAllUserGroup/$id<[^/]+>"""))
        

// @LINE:61
private[this] lazy val controllers_UserGroupController_addUserIntoUserGroup41_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userGroup/addUserIntoUserGroup"))))
private[this] lazy val controllers_UserGroupController_addUserIntoUserGroup41_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserGroupController]).addUserIntoUserGroup,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserGroupController", "addUserIntoUserGroup", Nil,"POST", """""", Routes.prefix + """userGroup/addUserIntoUserGroup"""))
        

// @LINE:62
private[this] lazy val controllers_UserGroupController_isBelongToUserGroup42_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userGroup/isBelongToUserGroup"))))
private[this] lazy val controllers_UserGroupController_isBelongToUserGroup42_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserGroupController]).isBelongToUserGroup,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserGroupController", "isBelongToUserGroup", Nil,"POST", """""", Routes.prefix + """userGroup/isBelongToUserGroup"""))
        

// @LINE:63
private[this] lazy val controllers_UserGroupController_getUserGroup43_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("userGroup/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserGroupController_getUserGroup43_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserGroupController]).getUserGroup(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserGroupController", "getUserGroup", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """userGroup/$id<[^/]+>"""))
        

// @LINE:66
private[this] lazy val controllers_FriendController_addFriend44_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("friend/add"))))
private[this] lazy val controllers_FriendController_addFriend44_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.FriendController]).addFriend,
HandlerDef(this.getClass.getClassLoader, "", "controllers.FriendController", "addFriend", Nil,"POST", """ Friend""", Routes.prefix + """friend/add"""))
        

// @LINE:67
private[this] lazy val controllers_FriendController_deleteFriend45_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("friend/delete"))))
private[this] lazy val controllers_FriendController_deleteFriend45_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.FriendController]).deleteFriend,
HandlerDef(this.getClass.getClassLoader, "", "controllers.FriendController", "deleteFriend", Nil,"POST", """""", Routes.prefix + """friend/delete"""))
        

// @LINE:68
private[this] lazy val controllers_FriendController_isFriendValid46_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("friend/isFriendValid"))))
private[this] lazy val controllers_FriendController_isFriendValid46_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.FriendController]).isFriendValid,
HandlerDef(this.getClass.getClassLoader, "", "controllers.FriendController", "isFriendValid", Nil,"POST", """""", Routes.prefix + """friend/isFriendValid"""))
        

// @LINE:69
private[this] lazy val controllers_FriendController_getFriend47_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("friend/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_FriendController_getFriend47_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.FriendController]).getFriend(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.FriendController", "getFriend", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """friend/$id<[^/]+>"""))
        

// @LINE:72
private[this] lazy val controllers_SubscriberController_addSubscriber48_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subscriber/add"))))
private[this] lazy val controllers_SubscriberController_addSubscriber48_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SubscriberController]).addSubscriber,
HandlerDef(this.getClass.getClassLoader, "", "controllers.SubscriberController", "addSubscriber", Nil,"POST", """ Subscriber""", Routes.prefix + """subscriber/add"""))
        

// @LINE:73
private[this] lazy val controllers_SubscriberController_deleteSubscriber49_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subscriber/deleteSubscriber"))))
private[this] lazy val controllers_SubscriberController_deleteSubscriber49_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SubscriberController]).deleteSubscriber,
HandlerDef(this.getClass.getClassLoader, "", "controllers.SubscriberController", "deleteSubscriber", Nil,"POST", """""", Routes.prefix + """subscriber/deleteSubscriber"""))
        

// @LINE:74
private[this] lazy val controllers_SubscriberController_getSubscriberByUserId50_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subscriber/getSubscriberByUserId/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_SubscriberController_getSubscriberByUserId50_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SubscriberController]).getSubscriberByUserId(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SubscriberController", "getSubscriberByUserId", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """subscriber/getSubscriberByUserId/$id<[^/]+>"""))
        

// @LINE:75
private[this] lazy val controllers_SubscriberController_getCollectorByUserId51_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subscriber/getCollectorByUserId/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_SubscriberController_getCollectorByUserId51_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SubscriberController]).getCollectorByUserId(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SubscriberController", "getCollectorByUserId", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """subscriber/getCollectorByUserId/$id<[^/]+>"""))
        

// @LINE:76
private[this] lazy val controllers_SubscriberController_isSubscriberValid52_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subscriber/isSubscriberValid"))))
private[this] lazy val controllers_SubscriberController_isSubscriberValid52_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SubscriberController]).isSubscriberValid,
HandlerDef(this.getClass.getClassLoader, "", "controllers.SubscriberController", "isSubscriberValid", Nil,"POST", """""", Routes.prefix + """subscriber/isSubscriberValid"""))
        

// @LINE:77
private[this] lazy val controllers_SubscriberController_getSubscriber53_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subscriber/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_SubscriberController_getSubscriber53_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SubscriberController]).getSubscriber(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SubscriberController", "getSubscriber", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """subscriber/$id<[^/]+>"""))
        

// @LINE:81
private[this] lazy val controllers_WorkflowController_getAllWorkflows54_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getAllWorkflows/json"))))
private[this] lazy val controllers_WorkflowController_getAllWorkflows54_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getAllWorkflows(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getAllWorkflows", Seq(classOf[String]),"GET", """Workflow""", Routes.prefix + """workflow/getAllWorkflows/json"""))
        

// @LINE:82
private[this] lazy val controllers_WorkflowController_getWorkflow55_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getWorkflow/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getWorkflow55_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflow(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getWorkflow", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/getWorkflow/id/$id<[^/]+>"""))
        

// @LINE:83
private[this] lazy val controllers_WorkflowController_addWorkflow56_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/addWorkflow"))))
private[this] lazy val controllers_WorkflowController_addWorkflow56_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addWorkflow,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "addWorkflow", Nil,"POST", """""", Routes.prefix + """workflow/addWorkflow"""))
        

// @LINE:84
private[this] lazy val controllers_WorkflowController_getAllLevels57_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getAllLevels/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getAllLevels57_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getAllLevels(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getAllLevels", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/getAllLevels/$id<[^/]+>"""))
        

// @LINE:85
private[this] lazy val controllers_WorkflowController_addLevel58_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/addLevel"))))
private[this] lazy val controllers_WorkflowController_addLevel58_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addLevel,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "addLevel", Nil,"POST", """""", Routes.prefix + """workflow/addLevel"""))
        

// @LINE:86
private[this] lazy val controllers_WorkflowController_addComment59_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/addComment"))))
private[this] lazy val controllers_WorkflowController_addComment59_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addComment,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "addComment", Nil,"POST", """""", Routes.prefix + """workflow/addComment"""))
        

// @LINE:87
private[this] lazy val controllers_WorkflowController_getWorkflowByUserId60_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getWorkflowByUserId/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getWorkflowByUserId60_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowByUserId(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getWorkflowByUserId", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/getWorkflowByUserId/$id<[^/]+>"""))
        

// @LINE:92
private[this] lazy val controllers_WorkflowController_getWorkflowViewCount61_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getViewCount/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getWorkflowViewCount61_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowViewCount(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getWorkflowViewCount", Seq(classOf[Long], classOf[String]),"GET", """Popularity""", Routes.prefix + """workflow/getViewCount/$id<[^/]+>"""))
        

// @LINE:93
private[this] lazy val controllers_WorkflowController_updateWorkflowViewCount62_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/updateViewCount/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_updateWorkflowViewCount62_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflowViewCount(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "updateWorkflowViewCount", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/updateViewCount/$id<[^/]+>"""))
        

// @LINE:94
private[this] lazy val controllers_WorkflowController_getWorkflowUsageCount63_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getUsageCount/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getWorkflowUsageCount63_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowUsageCount(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getWorkflowUsageCount", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/getUsageCount/$id<[^/]+>"""))
        

// @LINE:95
private[this] lazy val controllers_WorkflowController_updateWorkflowUsageCount64_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/updateUsageCount/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_updateWorkflowUsageCount64_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflowUsageCount(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "updateWorkflowUsageCount", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """workflow/updateUsageCount/id/$id<[^/]+>"""))
        

// @LINE:96
private[this] lazy val controllers_WorkflowController_getWorkflowDownloadCount65_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getDownloadCount/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getWorkflowDownloadCount65_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowDownloadCount(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getWorkflowDownloadCount", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/getDownloadCount/$id<[^/]+>"""))
        

// @LINE:97
private[this] lazy val controllers_WorkflowController_updateWorkflowDownloadCount66_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/updateDownloadCount/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_updateWorkflowDownloadCount66_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflowDownloadCount(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "updateWorkflowDownloadCount", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """workflow/updateDownloadCount/id/$id<[^/]+>"""))
        

// @LINE:98
private[this] lazy val controllers_WorkflowController_getWorkflowCommentCount67_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getCommentCount/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getWorkflowCommentCount67_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowCommentCount(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getWorkflowCommentCount", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/getCommentCount/$id<[^/]+>"""))
        

// @LINE:99
private[this] lazy val controllers_WorkflowController_updateWorkflowCommentCount68_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/updateCommentCount/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_updateWorkflowCommentCount68_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflowCommentCount(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "updateWorkflowCommentCount", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """workflow/updateCommentCount/id/$id<[^/]+>"""))
        

// @LINE:100
private[this] lazy val controllers_WorkflowController_getWorkflowReferenceCount69_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getReferenceCount/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getWorkflowReferenceCount69_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowReferenceCount(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getWorkflowReferenceCount", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/getReferenceCount/$id<[^/]+>"""))
        

// @LINE:101
private[this] lazy val controllers_WorkflowController_updateWorkflowReferenceCount70_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/updateReferenceCount/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_updateWorkflowReferenceCount70_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflowReferenceCount(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "updateWorkflowReferenceCount", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """workflow/updateReferenceCount/id/$id<[^/]+>"""))
        

// @LINE:102
private[this] lazy val controllers_WorkflowController_getTop10WorkflowByViewCount71_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getTop10WorkflowByViewCount/json"))))
private[this] lazy val controllers_WorkflowController_getTop10WorkflowByViewCount71_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop10WorkflowByViewCount(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTop10WorkflowByViewCount", Seq(classOf[String]),"GET", """""", Routes.prefix + """workflow/getTop10WorkflowByViewCount/json"""))
        

// @LINE:103
private[this] lazy val controllers_WorkflowController_getTop10WorkflowByUsageCount72_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getTop10WorkflowByUsageCount/json"))))
private[this] lazy val controllers_WorkflowController_getTop10WorkflowByUsageCount72_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop10WorkflowByUsageCount(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTop10WorkflowByUsageCount", Seq(classOf[String]),"GET", """""", Routes.prefix + """workflow/getTop10WorkflowByUsageCount/json"""))
        

// @LINE:104
private[this] lazy val controllers_WorkflowController_getTop10WorkflowByCommentCount73_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getTop10WorkflowByCommentCount/json"))))
private[this] lazy val controllers_WorkflowController_getTop10WorkflowByCommentCount73_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop10WorkflowByCommentCount(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTop10WorkflowByCommentCount", Seq(classOf[String]),"GET", """""", Routes.prefix + """workflow/getTop10WorkflowByCommentCount/json"""))
        

// @LINE:105
private[this] lazy val controllers_WorkflowController_getTop10WorkflowByDownloadCount74_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getTop10WorkflowByDownloadCount/json"))))
private[this] lazy val controllers_WorkflowController_getTop10WorkflowByDownloadCount74_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop10WorkflowByDownloadCount(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTop10WorkflowByDownloadCount", Seq(classOf[String]),"GET", """""", Routes.prefix + """workflow/getTop10WorkflowByDownloadCount/json"""))
        

// @LINE:106
private[this] lazy val controllers_WorkflowController_getTop10WorkflowByReferenceCount75_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getTop10WorkflowByReferenceCount/json"))))
private[this] lazy val controllers_WorkflowController_getTop10WorkflowByReferenceCount75_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop10WorkflowByReferenceCount(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTop10WorkflowByReferenceCount", Seq(classOf[String]),"GET", """""", Routes.prefix + """workflow/getTop10WorkflowByReferenceCount/json"""))
        

// @LINE:110
private[this] lazy val controllers_TagController_getAllTags76_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/getAllTags/json"))))
private[this] lazy val controllers_TagController_getAllTags76_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).getAllTags(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TagController", "getAllTags", Seq(classOf[String]),"GET", """Tag""", Routes.prefix + """tag/getAllTags/json"""))
        

// @LINE:111
private[this] lazy val controllers_TagController_getTag77_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/getTag/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_TagController_getTag77_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).getTag(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.TagController", "getTag", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """tag/getTag/id/$id<[^/]+>/json"""))
        

// @LINE:112
private[this] lazy val controllers_TagController_addTag78_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/addTag"))))
private[this] lazy val controllers_TagController_addTag78_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).addTag,
HandlerDef(this.getClass.getClassLoader, "", "controllers.TagController", "addTag", Nil,"POST", """""", Routes.prefix + """tag/addTag"""))
        

// @LINE:115
private[this] lazy val controllers_Assets_at79_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at79_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getClimateService/$name<[^/]+>/json""","""@controllers.ClimateServiceController@.getClimateService(name:String, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getClimateService/id/$id<[^/]+>""","""@controllers.ClimateServiceController@.getClimateServiceById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllClimateServices/json""","""@controllers.ClimateServiceController@.getAllClimateServices(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllMostRecentClimateServicesByCreateTime/json""","""@controllers.ClimateServiceController@.getAllClimateServicesOrderByCreateTime(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllMostRecentClimateServicesByLatestAccessTime/json""","""@controllers.ClimateServiceController@.getAllClimateServicesOrderByLatestAccessTime(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllMostUsedClimateServices/json""","""@controllers.ClimateServiceController@.getAllClimateServicesOrderByCount(format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/addClimateService""","""@controllers.ClimateServiceController@.addClimateService"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllServiceEntries/json""","""@controllers.ClimateServiceController@.getAllServiceEntries(format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/addServiceEntry""","""@controllers.ClimateServiceController@.addServiceEntry"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/updateClimateService/id/$id<[^/]+>""","""@controllers.ClimateServiceController@.updateClimateServiceById(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/updateClimateService/name/$oldName<[^/]+>""","""@controllers.ClimateServiceController@.updateClimateServiceByName(oldName:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/deleteClimateService/id/$id<[^/]+>""","""@controllers.ClimateServiceController@.deleteClimateServiceById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/deleteClimateService/name/$name<[^/]+>""","""@controllers.ClimateServiceController@.deleteClimateServiceByName(name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/getAllInstruments/json""","""@controllers.InstrumentController@.getAllInstruments(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/getInstrument/id/$id<[^/]+>/json""","""@controllers.InstrumentController@.getInstrument(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/addInstrument""","""@controllers.InstrumentController@.addInstrument"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/updateInstrument/id/$id<[^/]+>""","""@controllers.InstrumentController@.updateInstrumentById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/deleteInstrument/id/$id<[^/]+>""","""@controllers.InstrumentController@.deleteInstrument(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/getAllDatasets/json""","""@controllers.DatasetController@.getAllDatasets(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/getDataset/id/$id<[^/]+>/json""","""@controllers.DatasetController@.getDataset(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/addDataset""","""@controllers.DatasetController@.addDataset"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/updateDataset/id/$id<[^/]+>""","""@controllers.DatasetController@.updateDatasetById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/deleteDataset/id/$id<[^/]+>""","""@controllers.DatasetController@.deleteDataset(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/queryDataset""","""@controllers.DatasetController@.queryDatasets"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/getAllParameters/json""","""@controllers.ParameterController@.getAllParameters(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/getParameter/service/$id<[^/]+>/name/$name<[^/]+>/json""","""@controllers.ParameterController@.getParameterByName(id:Long, name:String, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/getParameter/id/$id<[^/]+>/json""","""@controllers.ParameterController@.getParameterById(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/addParameter""","""@controllers.ParameterController@.addParameter"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/updateParameter/id/$id<[^/]+>""","""@controllers.ParameterController@.updateParameterById(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/updateParameter/name/$oldName<[^/]+>""","""@controllers.ParameterController@.updateParameterByName(oldName:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/deleteParameter/service/$id<[^/]+>/name/$name<[^/]+>""","""@controllers.ParameterController@.deleteParameterByName(id:Long, name:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/add""","""@controllers.UserController@.addUser"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/update/$id<[^/]+>""","""@controllers.UserController@.updateUser(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/delete/$id<[^/]+>""","""@controllers.UserController@.deleteUser(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getAllUsers/json""","""@controllers.UserController@.getAllUsers(format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/isUserValid""","""@controllers.UserController@.isUserValid"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/delete/userName/$userName<[^/]+>/password/$password<[^/]+>""","""@controllers.UserController@.deleteUserByUserNameAndPassword(userName:String, password:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>""","""@controllers.UserController@.getUser(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userGroup/add""","""@controllers.UserGroupController@.addUserGroup"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userGroup/getAllUsersInGroup/$id<[^/]+>""","""@controllers.UserGroupController@.getAllUsersInGroup(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userGroup/getAllUserGroup/$id<[^/]+>""","""@controllers.UserGroupController@.getAllUserGroup(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userGroup/addUserIntoUserGroup""","""@controllers.UserGroupController@.addUserIntoUserGroup"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userGroup/isBelongToUserGroup""","""@controllers.UserGroupController@.isBelongToUserGroup"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """userGroup/$id<[^/]+>""","""@controllers.UserGroupController@.getUserGroup(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """friend/add""","""@controllers.FriendController@.addFriend"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """friend/delete""","""@controllers.FriendController@.deleteFriend"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """friend/isFriendValid""","""@controllers.FriendController@.isFriendValid"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """friend/$id<[^/]+>""","""@controllers.FriendController@.getFriend(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subscriber/add""","""@controllers.SubscriberController@.addSubscriber"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subscriber/deleteSubscriber""","""@controllers.SubscriberController@.deleteSubscriber"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subscriber/getSubscriberByUserId/$id<[^/]+>""","""@controllers.SubscriberController@.getSubscriberByUserId(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subscriber/getCollectorByUserId/$id<[^/]+>""","""@controllers.SubscriberController@.getCollectorByUserId(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subscriber/isSubscriberValid""","""@controllers.SubscriberController@.isSubscriberValid"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subscriber/$id<[^/]+>""","""@controllers.SubscriberController@.getSubscriber(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getAllWorkflows/json""","""@controllers.WorkflowController@.getAllWorkflows(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getWorkflow/id/$id<[^/]+>""","""@controllers.WorkflowController@.getWorkflow(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/addWorkflow""","""@controllers.WorkflowController@.addWorkflow"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getAllLevels/$id<[^/]+>""","""@controllers.WorkflowController@.getAllLevels(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/addLevel""","""@controllers.WorkflowController@.addLevel"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/addComment""","""@controllers.WorkflowController@.addComment"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getWorkflowByUserId/$id<[^/]+>""","""@controllers.WorkflowController@.getWorkflowByUserId(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getViewCount/$id<[^/]+>""","""@controllers.WorkflowController@.getWorkflowViewCount(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/updateViewCount/$id<[^/]+>""","""@controllers.WorkflowController@.updateWorkflowViewCount(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getUsageCount/$id<[^/]+>""","""@controllers.WorkflowController@.getWorkflowUsageCount(id:Long, format:String = "json")"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/updateUsageCount/id/$id<[^/]+>""","""@controllers.WorkflowController@.updateWorkflowUsageCount(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getDownloadCount/$id<[^/]+>""","""@controllers.WorkflowController@.getWorkflowDownloadCount(id:Long, format:String = "json")"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/updateDownloadCount/id/$id<[^/]+>""","""@controllers.WorkflowController@.updateWorkflowDownloadCount(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getCommentCount/$id<[^/]+>""","""@controllers.WorkflowController@.getWorkflowCommentCount(id:Long, format:String = "json")"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/updateCommentCount/id/$id<[^/]+>""","""@controllers.WorkflowController@.updateWorkflowCommentCount(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getReferenceCount/$id<[^/]+>""","""@controllers.WorkflowController@.getWorkflowReferenceCount(id:Long, format:String = "json")"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/updateReferenceCount/id/$id<[^/]+>""","""@controllers.WorkflowController@.updateWorkflowReferenceCount(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getTop10WorkflowByViewCount/json""","""@controllers.WorkflowController@.getTop10WorkflowByViewCount(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getTop10WorkflowByUsageCount/json""","""@controllers.WorkflowController@.getTop10WorkflowByUsageCount(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getTop10WorkflowByCommentCount/json""","""@controllers.WorkflowController@.getTop10WorkflowByCommentCount(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getTop10WorkflowByDownloadCount/json""","""@controllers.WorkflowController@.getTop10WorkflowByDownloadCount(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getTop10WorkflowByReferenceCount/json""","""@controllers.WorkflowController@.getTop10WorkflowByReferenceCount(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/getAllTags/json""","""@controllers.TagController@.getAllTags(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/getTag/id/$id<[^/]+>/json""","""@controllers.TagController@.getTag(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/addTag""","""@controllers.TagController@.addTag"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:10
case controllers_ClimateServiceController_getClimateService0_route(params) => {
   call(params.fromPath[String]("name", None), Param[String]("format", Right("json"))) { (name, format) =>
        controllers_ClimateServiceController_getClimateService0_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateService(name, format))
   }
}
        

// @LINE:11
case controllers_ClimateServiceController_getClimateServiceById1_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClimateServiceController_getClimateServiceById1_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateServiceById(id))
   }
}
        

// @LINE:12
case controllers_ClimateServiceController_getAllClimateServices2_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServices2_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServices(format))
   }
}
        

// @LINE:13
case controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCreateTime(format))
   }
}
        

// @LINE:14
case controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByLatestAccessTime(format))
   }
}
        

// @LINE:15
case controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCount(format))
   }
}
        

// @LINE:16
case controllers_ClimateServiceController_addClimateService6_route(params) => {
   call { 
        controllers_ClimateServiceController_addClimateService6_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addClimateService)
   }
}
        

// @LINE:17
case controllers_ClimateServiceController_getAllServiceEntries7_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllServiceEntries7_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllServiceEntries(format))
   }
}
        

// @LINE:18
case controllers_ClimateServiceController_addServiceEntry8_route(params) => {
   call { 
        controllers_ClimateServiceController_addServiceEntry8_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addServiceEntry)
   }
}
        

// @LINE:19
case controllers_ClimateServiceController_updateClimateServiceById9_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClimateServiceController_updateClimateServiceById9_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceById(id))
   }
}
        

// @LINE:20
case controllers_ClimateServiceController_updateClimateServiceByName10_route(params) => {
   call(params.fromPath[String]("oldName", None)) { (oldName) =>
        controllers_ClimateServiceController_updateClimateServiceByName10_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceByName(oldName))
   }
}
        

// @LINE:21
case controllers_ClimateServiceController_deleteClimateServiceById11_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClimateServiceController_deleteClimateServiceById11_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceById(id))
   }
}
        

// @LINE:22
case controllers_ClimateServiceController_deleteClimateServiceByName12_route(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        controllers_ClimateServiceController_deleteClimateServiceByName12_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceByName(name))
   }
}
        

// @LINE:25
case controllers_InstrumentController_getAllInstruments13_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_InstrumentController_getAllInstruments13_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getAllInstruments(format))
   }
}
        

// @LINE:26
case controllers_InstrumentController_getInstrument14_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_InstrumentController_getInstrument14_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getInstrument(id, format))
   }
}
        

// @LINE:27
case controllers_InstrumentController_addInstrument15_route(params) => {
   call { 
        controllers_InstrumentController_addInstrument15_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).addInstrument)
   }
}
        

// @LINE:28
case controllers_InstrumentController_updateInstrumentById16_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_InstrumentController_updateInstrumentById16_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).updateInstrumentById(id))
   }
}
        

// @LINE:29
case controllers_InstrumentController_deleteInstrument17_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_InstrumentController_deleteInstrument17_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).deleteInstrument(id))
   }
}
        

// @LINE:32
case controllers_DatasetController_getAllDatasets18_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_DatasetController_getAllDatasets18_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getAllDatasets(format))
   }
}
        

// @LINE:33
case controllers_DatasetController_getDataset19_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_DatasetController_getDataset19_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getDataset(id, format))
   }
}
        

// @LINE:34
case controllers_DatasetController_addDataset20_route(params) => {
   call { 
        controllers_DatasetController_addDataset20_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).addDataset)
   }
}
        

// @LINE:35
case controllers_DatasetController_updateDatasetById21_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DatasetController_updateDatasetById21_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).updateDatasetById(id))
   }
}
        

// @LINE:36
case controllers_DatasetController_deleteDataset22_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DatasetController_deleteDataset22_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).deleteDataset(id))
   }
}
        

// @LINE:37
case controllers_DatasetController_queryDatasets23_route(params) => {
   call { 
        controllers_DatasetController_queryDatasets23_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).queryDatasets)
   }
}
        

// @LINE:40
case controllers_ParameterController_getAllParameters24_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ParameterController_getAllParameters24_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getAllParameters(format))
   }
}
        

// @LINE:41
case controllers_ParameterController_getParameterByName25_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("name", None), Param[String]("format", Right("json"))) { (id, name, format) =>
        controllers_ParameterController_getParameterByName25_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterByName(id, name, format))
   }
}
        

// @LINE:42
case controllers_ParameterController_getParameterById26_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_ParameterController_getParameterById26_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterById(id, format))
   }
}
        

// @LINE:43
case controllers_ParameterController_addParameter27_route(params) => {
   call { 
        controllers_ParameterController_addParameter27_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).addParameter)
   }
}
        

// @LINE:44
case controllers_ParameterController_updateParameterById28_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ParameterController_updateParameterById28_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterById(id))
   }
}
        

// @LINE:45
case controllers_ParameterController_updateParameterByName29_route(params) => {
   call(params.fromPath[String]("oldName", None)) { (oldName) =>
        controllers_ParameterController_updateParameterByName29_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterByName(oldName))
   }
}
        

// @LINE:46
case controllers_ParameterController_deleteParameterByName30_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("name", None)) { (id, name) =>
        controllers_ParameterController_deleteParameterByName30_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).deleteParameterByName(id, name))
   }
}
        

// @LINE:49
case controllers_UserController_addUser31_route(params) => {
   call { 
        controllers_UserController_addUser31_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).addUser)
   }
}
        

// @LINE:50
case controllers_UserController_updateUser32_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_updateUser32_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).updateUser(id))
   }
}
        

// @LINE:51
case controllers_UserController_deleteUser33_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_deleteUser33_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUser(id))
   }
}
        

// @LINE:52
case controllers_UserController_getAllUsers34_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_UserController_getAllUsers34_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllUsers(format))
   }
}
        

// @LINE:53
case controllers_UserController_isUserValid35_route(params) => {
   call { 
        controllers_UserController_isUserValid35_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).isUserValid)
   }
}
        

// @LINE:54
case controllers_UserController_deleteUserByUserNameAndPassword36_route(params) => {
   call(params.fromPath[String]("userName", None), params.fromPath[String]("password", None)) { (userName, password) =>
        controllers_UserController_deleteUserByUserNameAndPassword36_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUserByUserNameAndPassword(userName, password))
   }
}
        

// @LINE:55
case controllers_UserController_getUser37_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_UserController_getUser37_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getUser(id, format))
   }
}
        

// @LINE:58
case controllers_UserGroupController_addUserGroup38_route(params) => {
   call { 
        controllers_UserGroupController_addUserGroup38_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserGroupController]).addUserGroup)
   }
}
        

// @LINE:59
case controllers_UserGroupController_getAllUsersInGroup39_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_UserGroupController_getAllUsersInGroup39_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserGroupController]).getAllUsersInGroup(id, format))
   }
}
        

// @LINE:60
case controllers_UserGroupController_getAllUserGroup40_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_UserGroupController_getAllUserGroup40_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserGroupController]).getAllUserGroup(id, format))
   }
}
        

// @LINE:61
case controllers_UserGroupController_addUserIntoUserGroup41_route(params) => {
   call { 
        controllers_UserGroupController_addUserIntoUserGroup41_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserGroupController]).addUserIntoUserGroup)
   }
}
        

// @LINE:62
case controllers_UserGroupController_isBelongToUserGroup42_route(params) => {
   call { 
        controllers_UserGroupController_isBelongToUserGroup42_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserGroupController]).isBelongToUserGroup)
   }
}
        

// @LINE:63
case controllers_UserGroupController_getUserGroup43_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_UserGroupController_getUserGroup43_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserGroupController]).getUserGroup(id, format))
   }
}
        

// @LINE:66
case controllers_FriendController_addFriend44_route(params) => {
   call { 
        controllers_FriendController_addFriend44_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.FriendController]).addFriend)
   }
}
        

// @LINE:67
case controllers_FriendController_deleteFriend45_route(params) => {
   call { 
        controllers_FriendController_deleteFriend45_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.FriendController]).deleteFriend)
   }
}
        

// @LINE:68
case controllers_FriendController_isFriendValid46_route(params) => {
   call { 
        controllers_FriendController_isFriendValid46_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.FriendController]).isFriendValid)
   }
}
        

// @LINE:69
case controllers_FriendController_getFriend47_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_FriendController_getFriend47_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.FriendController]).getFriend(id, format))
   }
}
        

// @LINE:72
case controllers_SubscriberController_addSubscriber48_route(params) => {
   call { 
        controllers_SubscriberController_addSubscriber48_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SubscriberController]).addSubscriber)
   }
}
        

// @LINE:73
case controllers_SubscriberController_deleteSubscriber49_route(params) => {
   call { 
        controllers_SubscriberController_deleteSubscriber49_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SubscriberController]).deleteSubscriber)
   }
}
        

// @LINE:74
case controllers_SubscriberController_getSubscriberByUserId50_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_SubscriberController_getSubscriberByUserId50_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SubscriberController]).getSubscriberByUserId(id, format))
   }
}
        

// @LINE:75
case controllers_SubscriberController_getCollectorByUserId51_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_SubscriberController_getCollectorByUserId51_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SubscriberController]).getCollectorByUserId(id, format))
   }
}
        

// @LINE:76
case controllers_SubscriberController_isSubscriberValid52_route(params) => {
   call { 
        controllers_SubscriberController_isSubscriberValid52_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SubscriberController]).isSubscriberValid)
   }
}
        

// @LINE:77
case controllers_SubscriberController_getSubscriber53_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_SubscriberController_getSubscriber53_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SubscriberController]).getSubscriber(id, format))
   }
}
        

// @LINE:81
case controllers_WorkflowController_getAllWorkflows54_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_WorkflowController_getAllWorkflows54_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getAllWorkflows(format))
   }
}
        

// @LINE:82
case controllers_WorkflowController_getWorkflow55_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_WorkflowController_getWorkflow55_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflow(id, format))
   }
}
        

// @LINE:83
case controllers_WorkflowController_addWorkflow56_route(params) => {
   call { 
        controllers_WorkflowController_addWorkflow56_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addWorkflow)
   }
}
        

// @LINE:84
case controllers_WorkflowController_getAllLevels57_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_WorkflowController_getAllLevels57_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getAllLevels(id, format))
   }
}
        

// @LINE:85
case controllers_WorkflowController_addLevel58_route(params) => {
   call { 
        controllers_WorkflowController_addLevel58_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addLevel)
   }
}
        

// @LINE:86
case controllers_WorkflowController_addComment59_route(params) => {
   call { 
        controllers_WorkflowController_addComment59_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addComment)
   }
}
        

// @LINE:87
case controllers_WorkflowController_getWorkflowByUserId60_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_WorkflowController_getWorkflowByUserId60_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowByUserId(id, format))
   }
}
        

// @LINE:92
case controllers_WorkflowController_getWorkflowViewCount61_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_WorkflowController_getWorkflowViewCount61_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowViewCount(id, format))
   }
}
        

// @LINE:93
case controllers_WorkflowController_updateWorkflowViewCount62_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_WorkflowController_updateWorkflowViewCount62_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflowViewCount(id, format))
   }
}
        

// @LINE:94
case controllers_WorkflowController_getWorkflowUsageCount63_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_WorkflowController_getWorkflowUsageCount63_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowUsageCount(id, format))
   }
}
        

// @LINE:95
case controllers_WorkflowController_updateWorkflowUsageCount64_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkflowController_updateWorkflowUsageCount64_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflowUsageCount(id))
   }
}
        

// @LINE:96
case controllers_WorkflowController_getWorkflowDownloadCount65_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_WorkflowController_getWorkflowDownloadCount65_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowDownloadCount(id, format))
   }
}
        

// @LINE:97
case controllers_WorkflowController_updateWorkflowDownloadCount66_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkflowController_updateWorkflowDownloadCount66_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflowDownloadCount(id))
   }
}
        

// @LINE:98
case controllers_WorkflowController_getWorkflowCommentCount67_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_WorkflowController_getWorkflowCommentCount67_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowCommentCount(id, format))
   }
}
        

// @LINE:99
case controllers_WorkflowController_updateWorkflowCommentCount68_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkflowController_updateWorkflowCommentCount68_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflowCommentCount(id))
   }
}
        

// @LINE:100
case controllers_WorkflowController_getWorkflowReferenceCount69_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_WorkflowController_getWorkflowReferenceCount69_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowReferenceCount(id, format))
   }
}
        

// @LINE:101
case controllers_WorkflowController_updateWorkflowReferenceCount70_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkflowController_updateWorkflowReferenceCount70_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflowReferenceCount(id))
   }
}
        

// @LINE:102
case controllers_WorkflowController_getTop10WorkflowByViewCount71_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_WorkflowController_getTop10WorkflowByViewCount71_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop10WorkflowByViewCount(format))
   }
}
        

// @LINE:103
case controllers_WorkflowController_getTop10WorkflowByUsageCount72_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_WorkflowController_getTop10WorkflowByUsageCount72_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop10WorkflowByUsageCount(format))
   }
}
        

// @LINE:104
case controllers_WorkflowController_getTop10WorkflowByCommentCount73_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_WorkflowController_getTop10WorkflowByCommentCount73_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop10WorkflowByCommentCount(format))
   }
}
        

// @LINE:105
case controllers_WorkflowController_getTop10WorkflowByDownloadCount74_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_WorkflowController_getTop10WorkflowByDownloadCount74_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop10WorkflowByDownloadCount(format))
   }
}
        

// @LINE:106
case controllers_WorkflowController_getTop10WorkflowByReferenceCount75_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_WorkflowController_getTop10WorkflowByReferenceCount75_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop10WorkflowByReferenceCount(format))
   }
}
        

// @LINE:110
case controllers_TagController_getAllTags76_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_TagController_getAllTags76_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).getAllTags(format))
   }
}
        

// @LINE:111
case controllers_TagController_getTag77_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_TagController_getTag77_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).getTag(id, format))
   }
}
        

// @LINE:112
case controllers_TagController_addTag78_route(params) => {
   call { 
        controllers_TagController_addTag78_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).addTag)
   }
}
        

// @LINE:115
case controllers_Assets_at79_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at79_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     