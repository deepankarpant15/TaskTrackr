$(document).ready(function() {
    // Initialize FullCalendar
    $('#calendar').fullCalendar({
        header: {
            left: 'prev,next today',
            center: 'title',
            right: 'month,agendaWeek,agendaDay'
        },
        events: function(start, end, timezone, callback) {
            // Fetch todos from your backend API
            $.ajax({
                url: '/todoManagement/getTodos',  // URL to the servlet endpoint for fetching todos
                dataType: 'json',  // Expecting JSON format
                success: function(data) {
                    var events = data.map(function(todo) {
                        return {
                            title: todo.title,
                            start: todo.start,  // The start date of the todo (as a string)
                            description: todo.description
                        };
                    });
                    callback(events);  // Pass events to FullCalendar for rendering
                },
                error: function() {
                    alert("There was an error fetching todos.");
                }
            });
        },
        editable: true,  // Allow dragging and dropping of events
        droppable: true  // Allow dropping of events
    });

    // Additional scripts for handling form submissions, etc. can go here
});
