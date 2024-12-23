 <!DOCTYPE html>
<html>
<head>
    <title>Calendar</title>
   
    <link href="https://cdn.jsdelivr.net/npm/fullcalendar@5.11.0/main.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/fullcalendar@5.11.0/main.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/fullcalendar@5.11.0/locales-all.min.js"></script>

    <style>
        body {
            font-family: Arial, sans-serif;
        }
        #calendar {
            max-width: 900px;
            margin: 40px auto;
        }
    </style>
</head>
<body>
    <h1 style="text-align: center;">Task Calendar</h1>
    <div id="calendar"></div>

    <script>
        document.addEventListener('DOMContentLoaded', function () {
            var calendarEl = document.getElementById('calendar');
            var calendar = new FullCalendar.Calendar(calendarEl, {
                initialView: 'dayGridMonth',
                events: 'fetch-tasks', // URL to fetch events from the backend
                eventClick: function(info) {
                    alert('Task: ' + info.event.title);
                }
            });
            calendar.render();
        });
    </script>

</body>
</html>


<!-- 

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Todo Calendar</title>
    <!-- FullCalendar CSS 
    <link href="https://cdn.jsdelivr.net/npm/fullcalendar@3.9.0/dist/fullcalendar.min.css" rel="stylesheet">
    <!-- jQuery 
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <!-- FullCalendar JS-
    <script src="https://cdn.jsdelivr.net/npm/fullcalendar@3.9.0/dist/fullcalendar.min.js"></script>
</head>
<body>

    <h1>Todo Calendar</h1>

    <!-- Button to show events/tasks in the calendar 
    <button onclick="loadTasks()">Show Tasks</button>

    <div id="calendar"></div>

    <script>
        // Initialize the calendar
        $(document).ready(function() {
            $('#calendar').fullCalendar({
                // Other FullCalendar options can be added here
                header: {
                    left: 'prev,next today',
                    center: 'title',
                    right: 'month,agendaWeek,agendaDay'
                },
                events: [] // This will be filled dynamically
            });
        });

        // Function to load tasks from the server
        function loadTasks() {
            // AJAX call to the backend to get the tasks
            $.ajax({
                url: 'getTasks', // Mapping to a servlet (you will create this servlet)
                method: 'GET',
                success: function(response) {
                    var events = JSON.parse(response); // Parse the response (assuming JSON format)
                    $('#calendar').fullCalendar('removeEvents'); // Clear any previous events
                    $('#calendar').fullCalendar('addEventSource', events); // Add the new tasks as events
                },
                error: function() {
                    alert('Error loading tasks');
                }
            });
        }
    </script>

</body>
</html>
-->

 <!--
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Todo Calendar</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/3.2.0/fullcalendar.min.css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.1/moment.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/3.2.0/fullcalendar.min.js"></script>
</head>
<body>
    <div id="calendar"></div>
    <script>
        $(document).ready(function() {
            $('#calendar').fullCalendar({
                events: function(start, end, timezone, callback) {
                    $.ajax({
                        url: '/todoManagement/getTodos',
                        dataType: 'json',
                        success: function(data) {
                            var events = data.map(function(todo) {
                                return {
                                    title: todo.title,
                                    start: todo.start,
                                    description: todo.description
                                };
                            });
                            callback(events);
                        }
                    });
                }
            });
        });
    </script>
</body>
</html>-->
