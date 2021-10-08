
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container" style="padding-top: 95px;" id="exercise">
    <div class="row">

        <!-- Colum I -->
        <div class="col-md-4">
            <div class="product-item">
                <a href="#"><img class="imagehover" src="<c:url value='/template/images/product_01.jpg'/>" alt=""></a>
                <div class="down-content">
                    <a href="#">
                        <h4>Exercise I</h4>
                    </a>
                    <p>Only Using Servlet.Only Using JSP.MVC</p>
                    <a type="button" class="btn btn-success" href="/exercise-userlogin">View</a>
                </div>
            </div>
        </div>

        <!-- Colum II -->
        <div class="col-md-4">
            <div class="product-item">
                <a class="imagehover" href="#"><img src="<c:url value='/template/images/product_01.jpg'/>" alt=""></a>
                <div class="down-content">
                    <a href="#">
                        <h4>Exercise II</h4>
                    </a>
                    <p>Develop Servlets</p>
                    <a type="button" class="btn btn-success" href="exercise-emailList">View</a>
                </div>
            </div>
        </div>

        <!-- Colum III -->
        <div class="col-md-4">
            <div class="product-item">
                <a href="#"><img class="imagehover" src="<c:url value='/template/images/product_01.jpg'/>" alt=""></a>
                <div class="down-content">
                    <a href="#">
                        <h4>Exercise III</h4>
                    </a>
                    <p>Develop JSP</p>
                    <a type="button" class="btn btn-success" href="/exercise-survey">View</a>
                </div>
            </div>
        </div>

        <!-- Colum IV -->
        <div class="col-md-4">
            <div class="product-item">
                <a href="#"><img class="imagehover" src="<c:url value='/template/images/product_04.jpg'/>" alt=""></a>
                <div class="down-content">
                    <a href="#">
                        <h4>Exercise Chapter 7</h4>
                    </a>
                    <p>Cookie and Session</p>
                    <a type="button" class="btn btn-success" href="/exercise-download">View</a>
                </div>
            </div>
        </div>

        <!-- Colum V -->
        <div class="col-md-4">
            <div class="product-item">
                <a href="#"><img class="imagehover" src="<c:url value='/template/images/product_04.jpg'/>" alt=""></a>
                <div class="down-content">
                    <a href="#">
                        <h4>Tittle goes here</h4>
                    </a>
                    <p>Lorem ipsume dolor sit amet, adipisicing elite.</p>
                    <button type="button" class="btn btn-success">View</button>
                </div>
            </div>
        </div>

        <!-- Colum VI -->
        <div class="col-md-4">
            <div class="product-item">
                <a href="#"><img class="imagehover" src="<c:url value='/template/images/product_04.jpg'/>" alt=""></a>
                <div class="down-content">
                    <a href="#">
                        <h4>Tittle goes here</h4>
                    </a>
                    <p>Lorem ipsume dolor sit amet, adipisicing elite.</p>
                    <button type="button" class="btn btn-success">View</button>
                </div>
            </div>
        </div>
    </div>
</div>
</div>

<!-- TEAM -->

<div class="team" id="myteam">
    <div class="container">
        <div class="section-header text-center">
            <p>Meet Our Team</p>
            <h2>
                Programmer & Workers</h2>
        </div>
        <div class="row">
            <div class="col-lg-4 col-md-6">
                <div class="team-item">
                    <div class="team-img">
                        <img src="<c:url value='template/images/team-1.jpg'/>" alt="Team Image">
                    </div>
                    <div class="team-text">
                        <h2>NguyenTruongGiang</h2>
                        <p>Engineer</p>
                        <div class="team-social">
                            <a href=""><i class="ti-twitter"></i></a>
                            <a href=""><i class="ti-apple"></i></a>
                            <a href=""><i class="ti-google"></i></a>
                            <a href=""><i class="ti-github"></i></a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="team-item">
                    <div class="team-img">
                        <img src="<c:url value='/template/images/team-2.jpg'/>" alt="Team Image">
                    </div>
                    <div class="team-text">
                        <h2>HoHoaiPhong</h2>
                        <p>Engineer</p>
                        <div class="team-social">
                            <a href=""><i class="ti-twitter"></i></a>
                            <a href=""><i class="ti-apple"></i></a>
                            <a href=""><i class="ti-google"></i></a>
                            <a href=""><i class="ti-github"></i></a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="team-item">
                    <div class="team-img">
                        <img src="<c:url value='/template/images/team-3.jpg'/>" alt="Team Image">
                    </div>
                    <div class="team-text">
                        <h2>Tran Le Thanh Tuyen</h2>
                        <p>Worker</p>
                        <div class="team-social">
                            <a href=""><i class="ti-twitter"></i></a>
                            <a href=""><i class="ti-apple"></i></a>
                            <a href=""><i class="ti-google"></i></a>
                            <a href=""><i class="ti-github"></i></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
