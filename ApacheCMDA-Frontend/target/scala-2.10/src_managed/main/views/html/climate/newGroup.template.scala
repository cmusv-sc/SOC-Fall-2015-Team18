
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more		   *
* contributor license agreements.  See the NOTICE file distributed with	   *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*																			   *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.											   *
*******************************************************************************/
object newGroup extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[UserGroup],play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more		   *
* contributor license agreements.  See the NOTICE file distributed with	   *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*																			   *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.											   *
*******************************************************************************/
    def apply/*18.2*/(userGroupForm: play.data.Form[UserGroup]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
<script src='"""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.61*/("""'></script>
<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""
		//alert($("#url").text());
	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.44*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("New User Group", scripts)/*31.33*/ {_display_(Seq[Any](format.raw/*31.35*/("""

"""),_display_(Seq[Any](/*33.2*/flash_message())),format.raw/*33.17*/("""

<h1 style="margin-left:490px">New User Group</h1>
"""),_display_(Seq[Any](/*36.2*/helper/*36.8*/.form(routes.UserGroupController.newGroup())/*36.52*/ {_display_(Seq[Any](format.raw/*36.54*/("""
<div class="ui-widget col-sm-offset-3 col-sm-7">
	<div class = "form-group">
		"""),_display_(Seq[Any](/*39.4*/inputText(userGroupForm("User Group Name"), 'class -> "form-control", 'id -> "groupName", '_label -> Messages("User Group Name"), 'placeholder -> "User Group Name", 'size->50))),format.raw/*39.179*/("""
	</div>
	<div class = "form-group">
		"""),_display_(Seq[Any](/*42.4*/inputText(userGroupForm("Summary"), 'class -> "form-control", 'id -> "summary", '_label -> Messages("Summary"), 'placeholder -> "Summary", 'size->50))),format.raw/*42.153*/("""
	</div>
	<div align="center">
		<input class="btn" type="submit" value="Submit">
	</div>
</div>

""")))})),format.raw/*49.2*/("""
""")))})),format.raw/*50.2*/("""
"""))}
    }
    
    def render(userGroupForm:play.data.Form[UserGroup]): play.api.templates.HtmlFormat.Appendable = apply(userGroupForm)
    
    def f:((play.data.Form[UserGroup]) => play.api.templates.HtmlFormat.Appendable) = (userGroupForm) => apply(userGroupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 04 23:00:01 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/newGroup.scala.html
                    HASH: 595d2b454b74eb19e15f4781055807f7ae2a4a12
                    MATRIX: 3169->1189|3305->1252|3320->1259|3405->1263|3456->1278|3471->1284|3533->1324|3634->1397|3663->1398|3721->1429|3749->1430|3804->1231|3833->1250|3861->1445|3899->1448|3939->1479|3979->1481|4017->1484|4054->1499|4142->1552|4156->1558|4209->1602|4249->1604|4365->1685|4563->1860|4638->1900|4810->2049|4940->2148|4973->2150
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|79->36|79->36|79->36|79->36|82->39|82->39|85->42|85->42|92->49|93->50
                    -- GENERATED --
                */
            