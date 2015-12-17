
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
* Licensed to the Apache Software Foundation (ASF) under one or more           *
* contributor license agreements.  See the NOTICE file distributed with       *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*                                                                               *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.                                               *
*******************************************************************************/
object oneUser extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[User,Boolean,Boolean,play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more           *
* contributor license agreements.  See the NOTICE file distributed with       *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*                                                                               *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.                                               *
*******************************************************************************/
    def apply/*18.2*/(user: User, isFriend: Boolean, isSubscribed: Boolean):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*18.56*/("""

"""),format.raw/*21.1*/("""
"""),_display_(Seq[Any](/*22.2*/main("User Profile")/*22.22*/ {_display_(Seq[Any](format.raw/*22.24*/("""

"""),_display_(Seq[Any](/*24.2*/flash_message())),format.raw/*24.17*/("""

<h1>User """),_display_(Seq[Any](/*26.11*/user/*26.15*/.userName)),format.raw/*26.24*/("""</h1>
<div style="overflow-y:scroll">

	<div class="navbar-collapse collapse" style="height:">
		<ul class="nav navbar-nav navbar-right">

			<li class="dropdown"><a href="#"
									class="dropdown-toggle" data-toggle="dropdown">Actions<b
					class="caret"></b></a>
				<ul class="dropdown-menu">

					"""),_display_(Seq[Any](/*37.7*/if(isFriend)/*37.19*/ {_display_(Seq[Any](format.raw/*37.21*/("""
					<li><a href=""""),_display_(Seq[Any](/*38.20*/{routes.UserController.deleteFriend(user.id, isSubscribed)})),format.raw/*38.79*/(""""><font size="2">Unfriend</font></a></li>
					""")))}/*39.7*/else/*39.11*/{_display_(Seq[Any](format.raw/*39.12*/("""
					<li><a href=""""),_display_(Seq[Any](/*40.20*/{routes.UserController.addFriend(user.id, isSubscribed)})),format.raw/*40.76*/(""""><font size="2">Add Friend</font></a></li>
					""")))})),format.raw/*41.7*/("""
					"""),_display_(Seq[Any](/*42.7*/if(isSubscribed)/*42.23*/ {_display_(Seq[Any](format.raw/*42.25*/("""
					<li><a href=""""),_display_(Seq[Any](/*43.20*/{routes.UserController.deleteSubscribe(user.id, isFriend)})),format.raw/*43.78*/(""""><font size="2">Unsubscribe</font></a></li>
					""")))}/*44.7*/else/*44.11*/{_display_(Seq[Any](format.raw/*44.12*/("""
					<li><a href=""""),_display_(Seq[Any](/*45.20*/{routes.UserController.addSubscribe(user.id, isFriend)})),format.raw/*45.75*/(""""><font size="2">Subscribe</font></a></li>
					""")))})),format.raw/*46.7*/("""

				</ul>
			</li>
		</ul>
	</div>

	<table class="table table-striped table-bordered table-condensed tablesorter" id="myTable">

		<tr>
			<th style="vertical-align: top;" class="col-md-2">Id</th>
			<td><font size="2">"""),_display_(Seq[Any](/*57.24*/user/*57.28*/.id)),format.raw/*57.31*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-1">User Name</th>
			<td><font size="2">"""),_display_(Seq[Any](/*61.24*/user/*61.28*/.userName)),format.raw/*61.37*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-2">First Name</th>
			<td><font size="2">"""),_display_(Seq[Any](/*65.24*/user/*65.28*/.firstName)),format.raw/*65.38*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-1">Last Name</th>
			<td><font size="2">"""),_display_(Seq[Any](/*69.24*/user/*69.28*/.lastName)),format.raw/*69.37*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-2">Affiliation</th>
			<td><font size="2">"""),_display_(Seq[Any](/*73.24*/user/*73.28*/.affiliation)),format.raw/*73.40*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-1">Phone Number</th>
			<td><font size="2">"""),_display_(Seq[Any](/*77.24*/user/*77.28*/.phoneNumber)),format.raw/*77.40*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-2">Research Fields</th>
			<td><font size="2">"""),_display_(Seq[Any](/*81.24*/user/*81.28*/.researchFields)),format.raw/*81.43*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-1">Email</th>
			<td><font size="2">"""),_display_(Seq[Any](/*85.24*/user/*85.28*/.email)),format.raw/*85.34*/("""</font></td>
		</tr>
		<tr>
			<th style="vertical-align: top;" class="col-md-2">Description</th>
			<td><font size="2">"""),_display_(Seq[Any](/*89.24*/user/*89.28*/.description)),format.raw/*89.40*/("""</font></td>
		</tr>

	</table>

</div>

""")))})))}
    }
    
    def render(user:User,isFriend:Boolean,isSubscribed:Boolean): play.api.templates.HtmlFormat.Appendable = apply(user,isFriend,isSubscribed)
    
    def f:((User,Boolean,Boolean) => play.api.templates.HtmlFormat.Appendable) = (user,isFriend,isSubscribed) => apply(user,isFriend,isSubscribed)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 11 08:39:52 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/oneUser.scala.html
                    HASH: dc8f50c34843b02c69acce4702c038214d8ac684
                    MATRIX: 3361->1288|3526->1342|3555->1361|3592->1363|3621->1383|3661->1385|3699->1388|3736->1403|3784->1415|3797->1419|3828->1428|4170->1735|4191->1747|4231->1749|4287->1769|4368->1828|4434->1876|4447->1880|4486->1881|4542->1901|4620->1957|4701->2007|4743->2014|4768->2030|4808->2032|4864->2052|4944->2110|5013->2161|5026->2165|5065->2166|5121->2186|5198->2241|5278->2290|5537->2513|5550->2517|5575->2520|5730->2639|5743->2643|5774->2652|5930->2772|5943->2776|5975->2786|6130->2905|6143->2909|6174->2918|6331->3039|6344->3043|6378->3055|6536->3177|6549->3181|6583->3193|6744->3318|6757->3322|6794->3337|6945->3452|6958->3456|6986->3462|7143->3583|7156->3587|7190->3599
                    LINES: 56->18|60->18|62->21|63->22|63->22|63->22|65->24|65->24|67->26|67->26|67->26|78->37|78->37|78->37|79->38|79->38|80->39|80->39|80->39|81->40|81->40|82->41|83->42|83->42|83->42|84->43|84->43|85->44|85->44|85->44|86->45|86->45|87->46|98->57|98->57|98->57|102->61|102->61|102->61|106->65|106->65|106->65|110->69|110->69|110->69|114->73|114->73|114->73|118->77|118->77|118->77|122->81|122->81|122->81|126->85|126->85|126->85|130->89|130->89|130->89
                    -- GENERATED --
                */
            