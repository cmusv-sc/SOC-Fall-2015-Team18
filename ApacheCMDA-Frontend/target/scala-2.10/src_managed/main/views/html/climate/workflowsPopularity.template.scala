
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
object workflowsPopularity extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.Workflow],play.data.Form[metadata.Workflow],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(workflows: List[metadata.Workflow], workflowForm: play.data.Form[metadata.Workflow]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
<script src='"""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.61*/("""'></script>
<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""

	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.87*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Workflows", scripts)/*31.28*/ {_display_(Seq[Any](format.raw/*31.30*/("""

"""),_display_(Seq[Any](/*33.2*/flash_message())),format.raw/*33.17*/("""

<h1>"""),_display_(Seq[Any](/*35.6*/workflows/*35.15*/.size())),format.raw/*35.22*/(""" Workflow Popularity</h1>
<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "csTable">
    <thead>
    <tr>
        <th class="col-md-2">Workflow ID</td>
        <th class="col-md-4">Workflow title</td>
        <th class="clo-md-4">Workflow Description</th>
        <th class="clo-md-4">Workflow ViewCount</th>

    </tr>
    </thead>
    """),_display_(Seq[Any](/*46.6*/for(workflow <- workflows) yield /*46.32*/{_display_(Seq[Any](format.raw/*46.33*/("""
    <tr>
        <td><a href = """"),_display_(Seq[Any](/*48.25*/routes/*48.31*/.WorkflowController.displayWorkflow(workflow.getId()))),format.raw/*48.84*/(""""><font size="3">"""),_display_(Seq[Any](/*48.102*/workflow/*48.110*/.getId())),format.raw/*48.118*/("""</a></font></td>

        <td><a href = """"),_display_(Seq[Any](/*50.25*/routes/*50.31*/.WorkflowController.displayWorkflow(workflow.getId()))),format.raw/*50.84*/(""""><font size="3">"""),_display_(Seq[Any](/*50.102*/workflow/*50.110*/.getTitle())),format.raw/*50.121*/("""</a></font></td>

        <td><span class=""""),_display_(Seq[Any](/*52.27*/workflow/*52.35*/.getDescription())),format.raw/*52.52*/(""" editable"  data-name='purpose'><font size="3">
            """),_display_(Seq[Any](/*53.14*/workflow/*53.22*/.getDescription())),format.raw/*53.39*/(""" </font></span></td>

        <td><a href = """"),_display_(Seq[Any](/*55.25*/routes/*55.31*/.WorkflowController.displayWorkflow(workflow.getId()))),format.raw/*55.84*/(""""><font size="3">"""),_display_(Seq[Any](/*55.102*/workflow/*55.110*/.getViewCount)),format.raw/*55.123*/("""</a></font></td>


    </tr>
    """)))})),format.raw/*59.6*/("""
</table>


""")))})),format.raw/*63.2*/("""
"""))}
    }
    
    def render(workflows:List[metadata.Workflow],workflowForm:play.data.Form[metadata.Workflow]): play.api.templates.HtmlFormat.Appendable = apply(workflows,workflowForm)
    
    def f:((List[metadata.Workflow],play.data.Form[metadata.Workflow]) => play.api.templates.HtmlFormat.Appendable) = (workflows,workflowForm) => apply(workflows,workflowForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 11 08:39:53 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/workflowsPopularity.scala.html
                    HASH: ce40e1eb3f4d68c0425839f854302d802838de05
                    MATRIX: 3212->1189|3391->1295|3406->1302|3491->1306|3542->1321|3557->1327|3619->1367|3720->1440|3749->1441|3779->1444|3807->1445|3862->1274|3891->1293|3919->1460|3957->1463|3992->1489|4032->1491|4070->1494|4107->1509|4149->1516|4167->1525|4196->1532|4608->1909|4650->1935|4689->1936|4759->1970|4774->1976|4849->2029|4904->2047|4922->2055|4953->2063|5031->2105|5046->2111|5121->2164|5176->2182|5194->2190|5228->2201|5308->2245|5325->2253|5364->2270|5461->2331|5478->2339|5517->2356|5599->2402|5614->2408|5689->2461|5744->2479|5762->2487|5798->2500|5863->2534|5907->2547
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|89->46|89->46|89->46|91->48|91->48|91->48|91->48|91->48|91->48|93->50|93->50|93->50|93->50|93->50|93->50|95->52|95->52|95->52|96->53|96->53|96->53|98->55|98->55|98->55|98->55|98->55|98->55|102->59|106->63
                    -- GENERATED --
                */
            