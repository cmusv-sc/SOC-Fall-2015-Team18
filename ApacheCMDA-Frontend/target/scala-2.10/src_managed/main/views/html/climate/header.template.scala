
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
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.4*/("""
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" style="padding-bottom: 0;" href="/climate"><img
					src='"""),_display_(Seq[Any](/*29.12*/routes/*29.18*/.Assets.at("images/NASA_JPL_logo.png"))),format.raw/*29.56*/("""' style="height: 40px; width: 220px;">&nbsp&nbsp<img
					src='"""),_display_(Seq[Any](/*30.12*/routes/*30.18*/.Assets.at("images/logo.png"))),format.raw/*30.47*/("""' style="height: 15px; width: 250px;"></a>
			</div>
			<div class="navbar-collapse collapse" style="height:">
				<ul class="nav navbar-nav navbar-right">

					<li class="dropdown"><a href="#"
											class="dropdown-toggle" data-toggle="dropdown">Workflow<b
							class="caret"></b></a>
						<ul class="dropdown-menu">

							<li><a href=""""),_display_(Seq[Any](/*40.22*/routes/*40.28*/.WorkflowController.workflows())),format.raw/*40.59*/("""">Workflow List</a></li>
							<li><a href=""""),_display_(Seq[Any](/*41.22*/routes/*41.28*/.TagController.tags())),format.raw/*41.49*/("""">Tag List</a></li>
							<li><a href=""""),_display_(Seq[Any](/*42.22*/routes/*42.28*/.WorkflowController.createWorkflow())),format.raw/*42.64*/("""">Create Workflow</a></li>
						</ul>

					</li>
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Service<b
							class="caret"></b></a>
						<ul class="dropdown-menu">

						<li><a href=""""),_display_(Seq[Any](/*52.21*/routes/*52.27*/.ClimateServiceController.climateServices())),format.raw/*52.70*/("""">Service List</a></li>
					
						</ul>
					
					</li>
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Dataset<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						
						<li><a href=""""),_display_(Seq[Any](/*62.21*/routes/*62.27*/.DatasetController.datasetList())),format.raw/*62.59*/("""">Dataset List</a></li>
						<li><a href=""""),_display_(Seq[Any](/*63.21*/routes/*63.27*/.DatasetController.searchDataset())),format.raw/*63.61*/("""">Search dataset</a></li>
						</ul>
					</li>
					"""),format.raw/*66.42*/("""
						"""),format.raw/*67.67*/("""
							"""),format.raw/*68.34*/("""
						"""),format.raw/*69.37*/("""
							"""),format.raw/*70.101*/("""
							"""),format.raw/*71.106*/("""
						"""),format.raw/*72.16*/("""
					"""),format.raw/*73.15*/("""
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">About<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
						<li><a href=""""),_display_(Seq[Any](/*79.21*/routes/*79.27*/.ClimateServiceController.home())),format.raw/*79.59*/("""">Home</a></li>
						<li><a href=""""),_display_(Seq[Any](/*80.21*/routes/*80.27*/.AboutusController.aboutUs())),format.raw/*80.55*/("""">About Us</a></li>
						<li><a href=""""),_display_(Seq[Any](/*81.21*/routes/*81.27*/.AboutusController.aboutProject())),format.raw/*81.60*/("""">About project</a></li>
						</ul>
					</li>
					"""),_display_(Seq[Any](/*84.7*/if(session.get("userId") == null || session.get("userId").trim.isEmpty)/*84.78*/ {_display_(Seq[Any](format.raw/*84.80*/("""
					<li class="dropdown"><a href="#"
											class="dropdown-toggle" data-toggle="dropdown">Sign In / Sign Up<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*89.22*/routes/*89.28*/.UserController.signInForm)),format.raw/*89.54*/("""">Sign In</a></li>
							<li><a href=""""),_display_(Seq[Any](/*90.22*/routes/*90.28*/.UserController.signUpForm)),format.raw/*90.54*/("""">Sign Up</a></li>
						</ul>
					</li>
					""")))}/*93.7*/else/*93.11*/{_display_(Seq[Any](format.raw/*93.12*/("""
					<li class="dropdown"><a href="#"
											class="dropdown-toggle" data-toggle="dropdown">My Profile<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*98.22*/routes/*98.28*/.UserController.profile)),format.raw/*98.51*/("""">Profile</a></li>
							"""),_display_(Seq[Any](/*99.9*/if(session.get("userId").equals("112"))/*99.48*/ {_display_(Seq[Any](format.raw/*99.50*/("""
							<li><a href=""""),_display_(Seq[Any](/*100.22*/routes/*100.28*/.UserController.allUsers)),format.raw/*100.52*/("""">All Users</a></li>
							""")))})),format.raw/*101.9*/("""
							<li><a href=""""),_display_(Seq[Any](/*102.22*/routes/*102.28*/.UserController.showFriends)),format.raw/*102.55*/("""">Friends</a></li>
							<li><a href=""""),_display_(Seq[Any](/*103.22*/routes/*103.28*/.UserController.showSubscriptions)),format.raw/*103.61*/("""">Subscriptions</a></li>
							<li><a href=""""),_display_(Seq[Any](/*104.22*/routes/*104.28*/.UserGroupController.showGroups)),format.raw/*104.59*/("""">User Groups</a></li>
							<li><a href=""""),_display_(Seq[Any](/*105.22*/routes/*105.28*/.UserController.signOut)),format.raw/*105.51*/("""">Sign Out</a></li>
						</ul>
					</li>
					""")))})),format.raw/*108.7*/("""
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 10 08:17:01 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: af40685ac9c8cabb10f4f4d01d601572a1ecb7a1
                    MATRIX: 3171->1205|3267->1207|3799->1703|3814->1709|3874->1747|3974->1811|3989->1817|4040->1846|4425->2195|4440->2201|4493->2232|4575->2278|4590->2284|4633->2305|4710->2346|4725->2352|4783->2388|5061->2630|5076->2636|5141->2679|5427->2929|5442->2935|5496->2967|5576->3011|5591->3017|5647->3051|5729->3141|5764->3208|5800->3242|5835->3279|5872->3380|5909->3486|5944->3502|5978->3517|6203->3706|6218->3712|6272->3744|6344->3780|6359->3786|6409->3814|6485->3854|6500->3860|6555->3893|6644->3947|6724->4018|6764->4020|7001->4221|7016->4227|7064->4253|7140->4293|7155->4299|7203->4325|7269->4373|7282->4377|7321->4378|7551->4572|7566->4578|7611->4601|7673->4628|7721->4667|7761->4669|7820->4691|7836->4697|7883->4721|7944->4750|8003->4772|8019->4778|8069->4805|8146->4845|8162->4851|8218->4884|8301->4930|8317->4936|8371->4967|8452->5011|8468->5017|8514->5040|8595->5089
                    LINES: 56->18|59->18|70->29|70->29|70->29|71->30|71->30|71->30|81->40|81->40|81->40|82->41|82->41|82->41|83->42|83->42|83->42|93->52|93->52|93->52|103->62|103->62|103->62|104->63|104->63|104->63|107->66|108->67|109->68|110->69|111->70|112->71|113->72|114->73|120->79|120->79|120->79|121->80|121->80|121->80|122->81|122->81|122->81|125->84|125->84|125->84|130->89|130->89|130->89|131->90|131->90|131->90|134->93|134->93|134->93|139->98|139->98|139->98|140->99|140->99|140->99|141->100|141->100|141->100|142->101|143->102|143->102|143->102|144->103|144->103|144->103|145->104|145->104|145->104|146->105|146->105|146->105|149->108
                    -- GENERATED --
                */
            