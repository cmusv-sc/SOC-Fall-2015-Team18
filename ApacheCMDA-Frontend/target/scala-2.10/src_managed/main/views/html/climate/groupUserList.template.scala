
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
object groupUserList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[UserGroup,List[User],play.data.Form[UserGroup],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(usergroup: UserGroup, users: List[User], userForm: play.data.Form[UserGroup]):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*18.80*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Group User List", scripts)/*31.34*/ {_display_(Seq[Any](format.raw/*31.36*/("""

"""),_display_(Seq[Any](/*33.2*/flash_message())),format.raw/*33.17*/("""

<h1>Users in Group """),_display_(Seq[Any](/*35.21*/usergroup/*35.30*/.groupName)),format.raw/*35.40*/("""</h1>
<h2>"""),_display_(Seq[Any](/*36.6*/usergroup/*36.15*/.listOfUser.size())),format.raw/*36.33*/(""" Users in total</h2>
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
""")))})),format.raw/*69.2*/("""
"""))}
    }
    
    def render(usergroup:UserGroup,users:List[User],userForm:play.data.Form[UserGroup]): play.api.templates.HtmlFormat.Appendable = apply(usergroup,users,userForm)
    
    def f:((UserGroup,List[User],play.data.Form[UserGroup]) => play.api.templates.HtmlFormat.Appendable) = (usergroup,users,userForm) => apply(usergroup,users,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 11 08:39:51 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/groupUserList.scala.html
                    HASH: 9bd6437e14b9a9a84cfa433092005a7dd26737b8
                    MATRIX: 3195->1189|3367->1288|3382->1295|3467->1299|3518->1314|3533->1320|3595->1360|3696->1433|3725->1434|3783->1465|3811->1466|3866->1267|3895->1286|3923->1481|3961->1484|4002->1516|4042->1518|4080->1521|4117->1536|4175->1558|4193->1567|4225->1577|4271->1588|4289->1597|4329->1615|4984->2235|5018->2253|5057->2254|5124->2285|5137->2289|5162->2292|5230->2324|5292->2364|5346->2382|5359->2386|5390->2395|5466->2435|5479->2439|5511->2449|5583->2485|5596->2489|5627->2498|5699->2534|5712->2538|5746->2550|5818->2586|5831->2590|5859->2596|5915->2621|5977->2652
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|79->36|79->36|79->36|97->54|97->54|97->54|99->56|99->56|99->56|100->57|100->57|100->57|100->57|100->57|101->58|101->58|101->58|102->59|102->59|102->59|103->60|103->60|103->60|104->61|104->61|104->61|107->64|112->69
                    -- GENERATED --
                */
            