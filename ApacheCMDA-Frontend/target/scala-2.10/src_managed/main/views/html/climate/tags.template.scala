
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
object tags extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.Tag],play.data.Form[metadata.Tag],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(tags: List[metadata.Tag], tagForm: play.data.Form[metadata.Tag]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
	<script src='"""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.62*/("""'></script>
	<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""

	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.67*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Climate Services", scripts)/*31.35*/ {_display_(Seq[Any](format.raw/*31.37*/("""
	
	"""),_display_(Seq[Any](/*33.3*/flash_message())),format.raw/*33.18*/("""   
	 
    <h1>"""),_display_(Seq[Any](/*35.10*/tags/*35.14*/.size())),format.raw/*35.21*/(""" Tag List</h1>
		<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "csTable">
		<thead>
	<tr>
		<th class="col-md-2">Tag ID</td>
		<th class="col-md-4">Tag Name</td>
		
	</tr>
	</thead>
	"""),_display_(Seq[Any](/*44.3*/for(tag <- tags) yield /*44.19*/{_display_(Seq[Any](format.raw/*44.20*/("""
	<tr>
		<td><a href = "#"><font size="3">"""),_display_(Seq[Any](/*46.37*/tag/*46.40*/.getId())),format.raw/*46.48*/("""</a></font></td>

		<td><span class=""""),_display_(Seq[Any](/*48.21*/tag/*48.24*/.getName())),format.raw/*48.34*/(""" editable"  data-name='purpose'><font size="3">
				"""),_display_(Seq[Any](/*49.6*/tag/*49.9*/.getName())),format.raw/*49.19*/(""" </font></span></td>

	</tr>
	""")))})),format.raw/*52.3*/("""
    </table>
 

""")))})),format.raw/*56.2*/("""
"""))}
    }
    
    def render(tags:List[metadata.Tag],tagForm:play.data.Form[metadata.Tag]): play.api.templates.HtmlFormat.Appendable = apply(tags,tagForm)
    
    def f:((List[metadata.Tag],play.data.Form[metadata.Tag]) => play.api.templates.HtmlFormat.Appendable) = (tags,tagForm) => apply(tags,tagForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 04 23:00:02 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/tags.scala.html
                    HASH: d7d127e6dbaf91faf80b41897d764d1181107943
                    MATRIX: 3217->1205|3376->1291|3391->1298|3476->1302|3528->1318|3543->1324|3605->1364|3707->1438|3736->1439|3766->1442|3794->1443|3849->1270|3878->1289|3906->1458|3944->1461|3986->1494|4026->1496|4066->1501|4103->1516|4155->1532|4168->1536|4197->1543|4457->1768|4489->1784|4528->1785|4607->1828|4619->1831|4649->1839|4723->1877|4735->1880|4767->1890|4855->1943|4866->1946|4898->1956|4960->1987|5009->2005
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|87->44|87->44|87->44|89->46|89->46|89->46|91->48|91->48|91->48|92->49|92->49|92->49|95->52|99->56
                    -- GENERATED --
                */
            