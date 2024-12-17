/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-11-18 03:50:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.todo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calendar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" <!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Calendar</title>\r\n");
      out.write("   \r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/fullcalendar@5.11.0/main.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/fullcalendar@5.11.0/main.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/fullcalendar@5.11.0/locales-all.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("        #calendar {\r\n");
      out.write("            max-width: 900px;\r\n");
      out.write("            margin: 40px auto;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h1 style=\"text-align: center;\">Task Calendar</h1>\r\n");
      out.write("    <div id=\"calendar\"></div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        document.addEventListener('DOMContentLoaded', function () {\r\n");
      out.write("            var calendarEl = document.getElementById('calendar');\r\n");
      out.write("            var calendar = new FullCalendar.Calendar(calendarEl, {\r\n");
      out.write("                initialView: 'dayGridMonth',\r\n");
      out.write("                events: 'fetch-tasks', // URL to fetch events from the backend\r\n");
      out.write("                eventClick: function(info) {\r\n");
      out.write("                    alert('Task: ' + info.event.title);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            calendar.render();\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Todo Calendar</title>\r\n");
      out.write("    <!-- FullCalendar CSS \r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/fullcalendar@3.9.0/dist/fullcalendar.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- jQuery \r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("    <!-- FullCalendar JS-\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/fullcalendar@3.9.0/dist/fullcalendar.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <h1>Todo Calendar</h1>\r\n");
      out.write("\r\n");
      out.write("    <!-- Button to show events/tasks in the calendar \r\n");
      out.write("    <button onclick=\"loadTasks()\">Show Tasks</button>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"calendar\"></div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        // Initialize the calendar\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            $('#calendar').fullCalendar({\r\n");
      out.write("                // Other FullCalendar options can be added here\r\n");
      out.write("                header: {\r\n");
      out.write("                    left: 'prev,next today',\r\n");
      out.write("                    center: 'title',\r\n");
      out.write("                    right: 'month,agendaWeek,agendaDay'\r\n");
      out.write("                },\r\n");
      out.write("                events: [] // This will be filled dynamically\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // Function to load tasks from the server\r\n");
      out.write("        function loadTasks() {\r\n");
      out.write("            // AJAX call to the backend to get the tasks\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: 'getTasks', // Mapping to a servlet (you will create this servlet)\r\n");
      out.write("                method: 'GET',\r\n");
      out.write("                success: function(response) {\r\n");
      out.write("                    var events = JSON.parse(response); // Parse the response (assuming JSON format)\r\n");
      out.write("                    $('#calendar').fullCalendar('removeEvents'); // Clear any previous events\r\n");
      out.write("                    $('#calendar').fullCalendar('addEventSource', events); // Add the new tasks as events\r\n");
      out.write("                },\r\n");
      out.write("                error: function() {\r\n");
      out.write("                    alert('Error loading tasks');\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write(" <!--\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Todo Calendar</title>\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/3.2.0/fullcalendar.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.1/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/3.2.0/fullcalendar.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"calendar\"></div>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            $('#calendar').fullCalendar({\r\n");
      out.write("                events: function(start, end, timezone, callback) {\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                        url: '/todoManagement/getTodos',\r\n");
      out.write("                        dataType: 'json',\r\n");
      out.write("                        success: function(data) {\r\n");
      out.write("                            var events = data.map(function(todo) {\r\n");
      out.write("                                return {\r\n");
      out.write("                                    title: todo.title,\r\n");
      out.write("                                    start: todo.start,\r\n");
      out.write("                                    description: todo.description\r\n");
      out.write("                                };\r\n");
      out.write("                            });\r\n");
      out.write("                            callback(events);\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>-->\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
