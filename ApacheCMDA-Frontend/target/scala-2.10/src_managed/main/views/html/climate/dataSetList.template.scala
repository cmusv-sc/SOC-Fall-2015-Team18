
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
object dataSetList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[DataSet],play.data.Form[DataSet],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(dataSets: List[DataSet], dataSetForm: play.data.Form[DataSet]):play.api.templates.HtmlFormat.Appendable = {
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

"""),_display_(Seq[Any](/*31.2*/main("Dataset List", scripts)/*31.31*/ {_display_(Seq[Any](format.raw/*31.33*/("""

"""),_display_(Seq[Any](/*33.2*/flash_message())),format.raw/*33.17*/("""

<h1>Climate Datasets</h1>
<h2>"""),_display_(Seq[Any](/*36.6*/dataSets/*36.14*/.size())),format.raw/*36.21*/(""" Datasets Found</h2>
<div style="overflow-y:scroll">

	<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable">
		<thead>
		<tr >
			<th style = "vertical-align: top;" class="col-md-1 header">Id</th>
			<th style = "vertical-align: top;" class="col-md-2">Dataset Name</th>
			<th style = "vertical-align: top;" class="col-md-1">Agency</th>
			<th style = "vertical-align: top;" class="col-md-1">Instrument</th>
			<th style = "vertical-align: top;" class="col-md-2">Physical variable</th>
			<th style = "vertical-align: top;" class="col-md-1">Variable short name</th>
			<th style = "vertical-align: top;" class="col-md-1">Units</th>
			<th style = "vertical-align: top;" class="col-md-1">Grid Dimension</th>
			<!--
            <th style = "vertical-align: top;" class="col-md-3">Source</th>
            <th style = "vertical-align: top;" class="col-md-3">Status</th>
            <th style = "vertical-align: top;" class="col-md-4">Responsible Person</th>
            <th style = "vertical-align: top;" class="col-md-4">Data Source Name in Web Interface</th>
            -->
			<th style = "vertical-align: top;" class="col-md-2">Variable Name in Web Interface</th>
			<th style = "vertical-align: top;" class="col-md-1">Data Source Input Parameter</th>
			<!-- <th style = "vertical-align: top;" class="col-md-3">Variable Name Input Parameter</th> -->
			<th style = "vertical-align: top;" class="col-md-1">Dataset Start Time</th>
			<th style = "vertical-align: top;"class="col-md-1">Dataset End Time</th>

		</tr>
		</thead>
		<tbody>
		"""),_display_(Seq[Any](/*65.4*/for(dataSet <- dataSets) yield /*65.28*/{_display_(Seq[Any](format.raw/*65.29*/("""
		<tr>
			<td><font size="2">"""),_display_(Seq[Any](/*67.24*/dataSet/*67.31*/.getId())),format.raw/*67.39*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*68.24*/dataSet/*68.31*/.getDataSetName())),format.raw/*68.48*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*69.24*/dataSet/*69.31*/.getAgencyId())),format.raw/*69.45*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*70.24*/dataSet/*70.31*/.getInstrument())),format.raw/*70.47*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*71.24*/dataSet/*71.31*/.getPhysicalVariable())),format.raw/*71.53*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*72.24*/dataSet/*72.31*/.getCMIP5VarName())),format.raw/*72.49*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*73.24*/dataSet/*73.31*/.getUnits())),format.raw/*73.42*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*74.24*/dataSet/*74.31*/.getGridDimension())),format.raw/*74.50*/("""</font></td>
			<!--
            <td><font size="2">"""),_display_(Seq[Any](/*76.33*/dataSet/*76.40*/.getSource())),format.raw/*76.52*/("""</font></td>
            <td><font size="2">"""),_display_(Seq[Any](/*77.33*/dataSet/*77.40*/.getStatus())),format.raw/*77.52*/("""</font></td>
            <td><font size="2">"""),_display_(Seq[Any](/*78.33*/dataSet/*78.40*/.getResponsiblePerson())),format.raw/*78.63*/("""</font></td>
            <td><font size="2">"""),_display_(Seq[Any](/*79.33*/dataSet/*79.40*/.getDataSourceName())),format.raw/*79.60*/("""</font></td>
            -->
			<td><font size="2">"""),_display_(Seq[Any](/*81.24*/dataSet/*81.31*/.getVariableName())),format.raw/*81.49*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*82.24*/dataSet/*82.31*/.getDataSourceInput())),format.raw/*82.52*/("""</font></td>
			<!--<td><font size="2">"""),_display_(Seq[Any](/*83.28*/dataSet/*83.35*/.getVariableNameInput())),format.raw/*83.58*/("""</font></td> -->
			<td><font size="2">"""),_display_(Seq[Any](/*84.24*/dataSet/*84.31*/.getStartTime())),format.raw/*84.46*/("""</font></td>
			<td><font size="2">"""),_display_(Seq[Any](/*85.24*/dataSet/*85.31*/.getEndTime())),format.raw/*85.44*/("""</font></td>

		</tr>

		""")))})),format.raw/*89.4*/("""
		</tbody>
	</table>



</div>
""")))})),format.raw/*96.2*/("""
"""))}
    }
    
    def render(dataSets:List[DataSet],dataSetForm:play.data.Form[DataSet]): play.api.templates.HtmlFormat.Appendable = apply(dataSets,dataSetForm)
    
    def f:((List[DataSet],play.data.Form[DataSet]) => play.api.templates.HtmlFormat.Appendable) = (dataSets,dataSetForm) => apply(dataSets,dataSetForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 04 23:00:00 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/dataSetList.scala.html
                    HASH: 464293f61c9fe7d6edd0b4eb99f7fb09784c6cd9
                    MATRIX: 3184->1189|3341->1273|3356->1280|3441->1284|3492->1299|3507->1305|3569->1345|3670->1418|3699->1419|3757->1450|3785->1451|3840->1252|3869->1271|3897->1466|3935->1469|3973->1498|4013->1500|4051->1503|4088->1518|4156->1551|4173->1559|4202->1566|5816->3145|5856->3169|5895->3170|5962->3201|5978->3208|6008->3216|6080->3252|6096->3259|6135->3276|6207->3312|6223->3319|6259->3333|6331->3369|6347->3376|6385->3392|6457->3428|6473->3435|6517->3457|6589->3493|6605->3500|6645->3518|6717->3554|6733->3561|6766->3572|6838->3608|6854->3615|6895->3634|6984->3687|7000->3694|7034->3706|7115->3751|7131->3758|7165->3770|7246->3815|7262->3822|7307->3845|7388->3890|7404->3897|7446->3917|7534->3969|7550->3976|7590->3994|7662->4030|7678->4037|7721->4058|7797->4098|7813->4105|7858->4128|7934->4168|7950->4175|7987->4190|8059->4226|8075->4233|8110->4246|8167->4272|8231->4305
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|79->36|79->36|79->36|108->65|108->65|108->65|110->67|110->67|110->67|111->68|111->68|111->68|112->69|112->69|112->69|113->70|113->70|113->70|114->71|114->71|114->71|115->72|115->72|115->72|116->73|116->73|116->73|117->74|117->74|117->74|119->76|119->76|119->76|120->77|120->77|120->77|121->78|121->78|121->78|122->79|122->79|122->79|124->81|124->81|124->81|125->82|125->82|125->82|126->83|126->83|126->83|127->84|127->84|127->84|128->85|128->85|128->85|132->89|139->96
                    -- GENERATED --
                */
            