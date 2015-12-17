
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
object groupList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[UserGroup],play.data.Form[UserGroup],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(groups: List[UserGroup], groupForm: play.data.Form[UserGroup]):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*18.65*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Group List", scripts)/*31.29*/ {_display_(Seq[Any](format.raw/*31.31*/("""

"""),_display_(Seq[Any](/*33.2*/flash_message())),format.raw/*33.17*/("""

<h1>User Groups</h1>
<h2>"""),_display_(Seq[Any](/*36.6*/groups/*36.12*/.size())),format.raw/*36.19*/(""" Groups found</h2>
<div style="overflow-y:scroll">

	<div class="navbar-collapse collapse" style="height:">
		<ul class="nav navbar-nav navbar-right">

			<li class="dropdown"><a href="#"
									class="dropdown-toggle" data-toggle="dropdown">Actions<b
					class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href=""""),_display_(Seq[Any](/*46.20*/{routes.UserGroupController.newGroupForm()})),format.raw/*46.63*/(""""><font size="2">New User Group</font></a></li>
				</ul>
			</li>
		</ul>
	</div>

	<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable">
		<thead>
		<tr >

			<th style = "vertical-align: top;" class="col-md-1 header">Id</th>
			<th style = "vertical-align: top;" class="col-md-2">Group Name</th>
			<th style = "vertical-align: top;" class="col-md-1">Summary</th>
			<th style = "vertical-align: top;" class="col-md-1">Number of Users</th>

		</tr>
		</thead>
		<tbody>
		"""),_display_(Seq[Any](/*64.4*/for(group <- groups) yield /*64.24*/{_display_(Seq[Any](format.raw/*64.25*/("""
		<tr>

			<td><font size="2">"""),_display_(Seq[Any](/*67.24*/group/*67.29*/.id)),format.raw/*67.32*/("""</font></td>

			<td><a href=""""),_display_(Seq[Any](/*69.18*/{routes.UserGroupController.oneGroup(group.id)})),format.raw/*69.65*/(""""><font size="2">"""),_display_(Seq[Any](/*69.83*/group/*69.88*/.groupName)),format.raw/*69.98*/("""</font></a></td>

			<td><font size="2">"""),_display_(Seq[Any](/*71.24*/group/*71.29*/.summary)),format.raw/*71.37*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*72.24*/group/*72.29*/.listOfUser.size())),format.raw/*72.47*/("""</font></td>

		</tr>

		""")))})),format.raw/*76.4*/("""
		</tbody>
	</table>

</div>
""")))})),format.raw/*81.2*/("""
"""))}
    }
    
    def render(groups:List[UserGroup],groupForm:play.data.Form[UserGroup]): play.api.templates.HtmlFormat.Appendable = apply(groups,groupForm)
    
    def f:((List[UserGroup],play.data.Form[UserGroup]) => play.api.templates.HtmlFormat.Appendable) = (groups,groupForm) => apply(groups,groupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 11 08:39:51 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/groupList.scala.html
                    HASH: e0bf1ae14db70b4b286258e66208d1d9c690c23f
                    MATRIX: 3186->1189|3343->1273|3358->1280|3443->1284|3494->1299|3509->1305|3571->1345|3672->1418|3701->1419|3759->1450|3787->1451|3842->1252|3871->1271|3899->1466|3937->1469|3973->1496|4013->1498|4051->1501|4088->1516|4151->1544|4166->1550|4195->1557|4563->1889|4628->1932|5178->2447|5214->2467|5253->2468|5321->2500|5335->2505|5360->2508|5427->2539|5496->2586|5550->2604|5564->2609|5596->2619|5673->2660|5687->2665|5717->2673|5789->2709|5803->2714|5843->2732|5900->2758|5962->2789
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|79->36|79->36|79->36|89->46|89->46|107->64|107->64|107->64|110->67|110->67|110->67|112->69|112->69|112->69|112->69|112->69|114->71|114->71|114->71|115->72|115->72|115->72|119->76|124->81
                    -- GENERATED --
                */
            