
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
object userList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[User],play.data.Form[User],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(users: List[User], userForm: play.data.Form[User]):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*18.53*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("User List", scripts)/*31.28*/ {_display_(Seq[Any](format.raw/*31.30*/("""

"""),_display_(Seq[Any](/*33.2*/flash_message())),format.raw/*33.17*/("""

<h1>Users</h1>
<h2>"""),_display_(Seq[Any](/*36.6*/users/*36.11*/.size())),format.raw/*36.18*/(""" Users found</h2>
<div style="overflow-y:scroll">


	<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable">
		<thead>
		<tr >

			<th style = "vertical-align: top;" class="col-md-1 header">Id</th>
			<th style = "vertical-align: top;" class="col-md-2">User Name</th>
			<th style = "vertical-align: top;" class="col-md-1">First Name</th>
			<th style = "vertical-align: top;" class="col-md-1">Last Name</th>
			<th style = "vertical-align: top;" class="col-md-2">Affiliation</th>
			<th style = "vertical-align: top;" class="col-md-1">Email</th>

		</tr>
		</thead>
		<tbody>
		"""),_display_(Seq[Any](/*54.4*/for(user <- users) yield /*54.22*/{_display_(Seq[Any](format.raw/*54.23*/("""
		<tr>

			<td><font size="2">"""),_display_(Seq[Any](/*57.24*/user/*57.28*/.id)),format.raw/*57.31*/("""</font></td>

			<td><a href = """"),_display_(Seq[Any](/*59.20*/{routes.UserController.oneUser(user.id)})),format.raw/*59.60*/(""""><font size="2">"""),_display_(Seq[Any](/*59.78*/user/*59.82*/.userName)),format.raw/*59.91*/("""</font></a></td>

			<td><font size="2">"""),_display_(Seq[Any](/*61.24*/user/*61.28*/.firstName)),format.raw/*61.38*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*62.24*/user/*62.28*/.lastName)),format.raw/*62.37*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*63.24*/user/*63.28*/.affiliation)),format.raw/*63.40*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*64.24*/user/*64.28*/.email)),format.raw/*64.34*/("""</font></td>

		</tr>

		""")))})),format.raw/*68.4*/("""
		</tbody>
	</table>

</div>
""")))})),format.raw/*73.2*/("""
"""))}
    }
    
    def render(users:List[User],userForm:play.data.Form[User]): play.api.templates.HtmlFormat.Appendable = apply(users,userForm)
    
    def f:((List[User],play.data.Form[User]) => play.api.templates.HtmlFormat.Appendable) = (users,userForm) => apply(users,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 04 23:00:02 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/userList.scala.html
                    HASH: e8e596fe7e7fd2cfca1ab427f25e21fcdd01a6c5
                    MATRIX: 3175->1189|3320->1261|3335->1268|3420->1272|3471->1287|3486->1293|3548->1333|3649->1406|3678->1407|3736->1438|3764->1439|3819->1240|3848->1259|3876->1454|3914->1457|3949->1483|3989->1485|4027->1488|4064->1503|4121->1525|4135->1530|4164->1537|4816->2154|4850->2172|4889->2173|4957->2205|4970->2209|4995->2212|5064->2245|5126->2285|5180->2303|5193->2307|5224->2316|5301->2357|5314->2361|5346->2371|5418->2407|5431->2411|5462->2420|5534->2456|5547->2460|5581->2472|5653->2508|5666->2512|5694->2518|5751->2544|5813->2575
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|79->36|79->36|79->36|97->54|97->54|97->54|100->57|100->57|100->57|102->59|102->59|102->59|102->59|102->59|104->61|104->61|104->61|105->62|105->62|105->62|106->63|106->63|106->63|107->64|107->64|107->64|111->68|116->73
                    -- GENERATED --
                */
            