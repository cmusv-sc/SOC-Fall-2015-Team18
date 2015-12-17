
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
object subscriptionList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[User],play.data.Form[User],play.api.templates.HtmlFormat.Appendable] {

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

<h1>Subscriptions</h1>
<h2>"""),_display_(Seq[Any](/*36.6*/users/*36.11*/.size())),format.raw/*36.18*/(""" Subscriptions in total</h2>
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
			<td><font size="2">"""),_display_(Seq[Any](/*56.24*/user/*56.28*/.id)),format.raw/*56.31*/("""</font></td>
			<td><a href = """"),_display_(Seq[Any](/*57.20*/{routes.UserController.oneUser(user.id)})),format.raw/*57.60*/(""""><font size="2">"""),_display_(Seq[Any](/*57.78*/user/*57.82*/.userName)),format.raw/*57.91*/("""</font></a></td>
			<td><font size="2">"""),_display_(Seq[Any](/*58.24*/user/*58.28*/.firstName)),format.raw/*58.38*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*59.24*/user/*59.28*/.lastName)),format.raw/*59.37*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*60.24*/user/*60.28*/.affiliation)),format.raw/*60.40*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*61.24*/user/*61.28*/.email)),format.raw/*61.34*/("""</font></td>
		</tr>

		""")))})),format.raw/*64.4*/("""
		</tbody>
	</table>



</div>
""")))})),format.raw/*71.2*/("""
"""))}
    }
    
    def render(users:List[User],userForm:play.data.Form[User]): play.api.templates.HtmlFormat.Appendable = apply(users,userForm)
    
    def f:((List[User],play.data.Form[User]) => play.api.templates.HtmlFormat.Appendable) = (users,userForm) => apply(users,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 11 08:39:52 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/subscriptionList.scala.html
                    HASH: 57560641e3d0c6a3786c265080012cf4cc2624e9
                    MATRIX: 3183->1189|3328->1261|3343->1268|3428->1272|3479->1287|3494->1293|3556->1333|3657->1406|3686->1407|3744->1438|3772->1439|3827->1240|3856->1259|3884->1454|3922->1457|3957->1483|3997->1485|4035->1488|4072->1503|4137->1533|4151->1538|4180->1545|4843->2173|4877->2191|4916->2192|4983->2223|4996->2227|5021->2230|5089->2262|5151->2302|5205->2320|5218->2324|5249->2333|5325->2373|5338->2377|5370->2387|5442->2423|5455->2427|5486->2436|5558->2472|5571->2476|5605->2488|5677->2524|5690->2528|5718->2534|5774->2559|5838->2592
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|79->36|79->36|79->36|97->54|97->54|97->54|99->56|99->56|99->56|100->57|100->57|100->57|100->57|100->57|101->58|101->58|101->58|102->59|102->59|102->59|103->60|103->60|103->60|104->61|104->61|104->61|107->64|114->71
                    -- GENERATED --
                */
            