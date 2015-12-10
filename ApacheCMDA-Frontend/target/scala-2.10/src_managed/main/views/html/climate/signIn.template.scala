
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
object signIn extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[User],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(userForm: play.data.Form[User]):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*18.34*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Sign In", scripts)/*31.26*/ {_display_(Seq[Any](format.raw/*31.28*/("""

"""),_display_(Seq[Any](/*33.2*/flash_message())),format.raw/*33.17*/("""


<h1 style="margin-left:490px">Sign In</h1>
"""),_display_(Seq[Any](/*37.2*/helper/*37.8*/.form(routes.UserController.signIn())/*37.45*/ {_display_(Seq[Any](format.raw/*37.47*/("""
<div class="ui-widget col-sm-offset-3 col-sm-7">
	<div class = "form-group">
		"""),_display_(Seq[Any](/*40.4*/inputText(userForm("Email"), 'class -> "form-control", 'id -> "email", '_label -> Messages("Email"), 'placeholder -> "johnSmith@gmail.com", 'size->50))),format.raw/*40.154*/("""
	</div>
	<div class = "form-group">
		"""),_display_(Seq[Any](/*43.4*/inputText(userForm("Password"), 'class -> "form-control", 'id -> "password", '_label -> Messages("Password"), 'placeholder -> "Password", 'size->50))),format.raw/*43.152*/("""
	</div>
	<div align="center">
		<input class="btn" type="submit" value="Submit">
	</div>
</div>

""")))})),format.raw/*50.2*/("""
""")))})),format.raw/*51.2*/("""
"""))}
    }
    
    def render(userForm:play.data.Form[User]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((play.data.Form[User]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 04 23:00:01 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/signIn.scala.html
                    HASH: 608673b5383e1b5b4aacdffe3f236578fea2be22
                    MATRIX: 3162->1189|3288->1242|3303->1249|3388->1253|3439->1268|3454->1274|3516->1314|3617->1387|3646->1388|3704->1419|3732->1420|3787->1221|3816->1240|3844->1435|3882->1438|3915->1462|3955->1464|3993->1467|4030->1482|4112->1529|4126->1535|4172->1572|4212->1574|4328->1655|4501->1805|4576->1845|4747->1993|4877->2092|4910->2094
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|80->37|80->37|80->37|80->37|83->40|83->40|86->43|86->43|93->50|94->51
                    -- GENERATED --
                */
            