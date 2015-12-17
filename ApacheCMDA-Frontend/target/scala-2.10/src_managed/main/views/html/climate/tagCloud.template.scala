
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
/**/
object tagCloud extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <title>Tag Cloud</title>
    <link rel="stylesheet" type="text/css" href="/assets/jqcloud/jqcloud.css"/>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.js"></script>
    <script type="text/javascript" src="/assets/jqcloud/jqcloud-1.0.4.js"></script>
    <script type="text/javascript">

    $.getJSON("http://localhost:9034/tag/getAllTagWeights/json", function(data, status)"""),format.raw/*10.88*/("""{"""),format.raw/*10.89*/("""
    $(function() """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/("""
          $("#my_favorite_latin_words").jQCloud(data);
        """),format.raw/*13.9*/("""}"""),format.raw/*13.10*/(""");
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/(""");

    </script>
</head>
<body>
"""),format.raw/*21.3*/("""
<div align="center">
    <h2 class="text-center">Tag Cloud</h2>


    <div id="my_favorite_latin_words" style="width: 550px; height: 350px; border: 1px solid #ccc;"></div>
</div>

</body>


</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 11 08:39:52 UTC 2015
                    SOURCE: /home/SOC-Fall-2015/Dev/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/tagCloud.scala.html
                    HASH: 86d1fed3dd10cf6cd4ff11d25588acefc1606562
                    MATRIX: 866->0|1362->468|1391->469|1437->487|1466->488|1557->552|1586->553|1620->560|1648->561|1708->618
                    LINES: 29->1|38->10|38->10|39->11|39->11|41->13|41->13|42->14|42->14|47->21
                    -- GENERATED --
                */
            