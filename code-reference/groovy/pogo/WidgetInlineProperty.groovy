package org.gex.v1
import groovy.transform.*
import javax.validation.constraints.*
/**
 *A widget is used to generated partials
 **/
@CompileStatic
@Canonical
public class WidgetInlineProperty implements Serializable {

  /* The friendly name of the widget  */
  String name


  Composite composite


  Zid zid


  String otherColor

  static class Composite implements Serializable {

    /* The unique identifier of the widget  */
    String xid

    /* The friendly name of the widget  */
    String name

    /* Common set of keywords to categorize widgets */
    List<String> tags

    /* The version of the Widget  */
    String groupId

    /* The version of the Widget  */
    String artifactId

    /* The version of the Widget  */
    String revision

    /* The description of the Widget  */
    String desc

  }
  static class Zid implements Serializable {

    /* The unique identifier of the widget  */
    String xid

    /* The friendly name of the widget  */
    String colour

    /* The version of the Widget  */
    String ipsum

    /* The description of the Widget  */
    String lorem

  }
}
