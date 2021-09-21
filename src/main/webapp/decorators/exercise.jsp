<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Pipeline Bootstrap 4.0 Theme</title>
    <link rel="stylesheet" href="//fonts.googleapis.com/css?family=Open+Sans:300,400">
    <link rel="stylesheet" href="<c:url value='template/bootstrap/Exercise/css/font-awesome.min.css'/>">
    <link rel="stylesheet" href="<c:url value='template/bootstrap/Exercise/css/bootstrap.min.css'/>">
    <link rel="stylesheet" href="<c:url value='template/bootstrap/Exercise/css/magnific-popup.css'/>">
    <link rel="stylesheet" href="<c:url value='template/bootstrap/Exercise/css/templatemo-style.css'/>">
</head>
<body>
<div class="container-fluid">

    <section id="welcome" class="tm-content-box tm-banner margin-b-10">
        <div class="tm-banner-inner">
            <h1 class="tm-banner-title">Pipeline</h1>
        </div>
    </section>

    <div class="tm-body">
        <div class="tm-sidebar">
            <li class="tm-nav-item"><a href="/home" class="tm-nav-item-link tm-button">
                <i class="fa fa-smile-o tm-nav-fa"></i>Home</a>
            </li>
            <li class="tm-nav-item"><a href="/exercise-userlogin2" class="tm-nav-item-link tm-button">
                <i class="fa fa-image tm-nav-fa"></i>Using Only Servlet</a>
            </li>
            <li class="tm-nav-item"><a href="/exercise-userlogin" class="tm-nav-item-link tm-button">
                <i class="fa fa-tasks tm-nav-fa"></i>Using MVC</a>
            </li>
            <li class="tm-nav-item"><a href="#about" class="tm-nav-item-link tm-button">
                <i class="fa fa-sitemap tm-nav-fa"></i>Only Using JSP</a>
            </li>
            <li class="tm-nav-item"><a href="#contact" class="tm-nav-item-link tm-button">
                <i class="fa fa-envelope-o tm-nav-fa"></i>Contact Us</a>
            </li>
        </div>

        <div class="tm-main-content">
            <dec:body></dec:body>
        </div>
    </div>
</div>

<!-- Templatemo scripts -->
<script>
    var map = '';
    var center;

    function initialize() {
        var mapOptions = {
            zoom: 16,
            center: new google.maps.LatLng(37.769725, -122.462154),
            scrollwheel: false
        };

        map = new google.maps.Map(document.getElementById('google-map'),  mapOptions);

        google.maps.event.addDomListener(map, 'idle', function() {
            calculateCenter();
        });

        google.maps.event.addDomListener(window, 'resize', function() {
            map.setCenter(center);
        });
    }

    function calculateCenter() {
        center = map.getCenter();
    }

    function loadGoogleMap(){
        var script = document.createElement('script');
        script.type = 'text/javascript';
        script.src = 'https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false&' + 'callback=initialize';
        document.body.appendChild(script);
    }

    function setNavbar() {
        if ($(document).scrollTop() > 160) {
            $('.tm-sidebar').addClass('sticky');
        } else {
            $('.tm-sidebar').removeClass('sticky');
        }
    }

    $(document).ready(function(){

        // Single page nav
        $('.tm-main-nav').singlePageNav({
            'currentClass' : "active",
            offset : 20
        });

        // Detect window scroll and change navbar
        setNavbar();

        $(window).scroll(function() {
            setNavbar();
        });

        // Magnific pop up
        $('.tm-gallery').magnificPopup({
            delegate: 'a', // child items selector, by clicking on it popup will open
            type: 'image',
            gallery: {enabled:true}
            // other options
        });

        // Google Map
        loadGoogleMap();
    });

</script>

</body>
</html>