<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="dbc" scope="request"
	class="com.ehealth.utill.DBUtil"></jsp:useBean>
<jsp:setProperty property="*" name="dbc" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Smart Health Monitoring</title>
	
    <!-- css -->
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="plugins/cubeportfolio/css/cubeportfolio.min.css">
	<link href="css/nivo-lightbox.css" rel="stylesheet" />
	<link href="css/nivo-lighFtbox-theme/default/default.css" rel="stylesheet" type="text/css" />
	<link href="css/owl.carousel.css" rel="stylesheet" media="screen" />
    <link href="css/owl.theme.css" rel="stylesheet" media="screen" />
	<link href="css/animate.css" rel="stylesheet" />
    <link href="css/style.css" rel="stylesheet">

	<!-- boxed bg -->
	<link id="bodybg" href="bodybg/bg1.css" rel="stylesheet" type="text/css" />
	<!-- template skin -->
	<link id="t-colors" href="color/default.css" rel="stylesheet">
    
    <!-- =======================================================
        Theme Name: Medicio
        Theme URL: https://bootstrapmade.com/medicio-free-bootstrap-theme/
        Author: BootstrapMade
        Author URL: https://bootstrapmade.com
    ======================================================= -->
</head>
<body id="page-top" data-spy="scroll" data-target=".navbar-custom">

<div id="wrapper">
	
    <nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
		<div class="top-area">
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-md-6">
					<p class="italic text-left">Email:likhi1996@gmail.com</p>
					</div>
					<div class="col-sm-6 col-md-6">
					<p class="italic text-right">Call us now +919886771179</p>
					</div>
				</div>
			</div>
		</div>
        <div class="container navigation">
		
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                    <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand" href="index.html">
                    <img src="img/logo.png" alt="smart health" width="150" height="40" />
                </a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
			  <ul class="nav navbar-nav">
				<li class="active"><a href="#today">ToDay</a></li>
				<li><a href="#week">Week</a></li>
				<li><a href="#all">All</a></li>
					<li><a href="#search">Search</a></li>
				<li><a href="./logout.html">Logout</a></li>
				
			  </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
	

	<!-- Section: intro -->
    <section id="today" class="intro">
		<div class="intro-content">
			<div class="container">
				<div class="row">
					<div class="wow fadeInDown" data-wow-offset="0" data-wow-delay="0.1s">
					</div>
						<div class="form-wrapper">
						<div>
						
							<div class="panel panel-skin">
									<div class="panel-body">
    					                <form action="./pharmacy" method="post" role="form" class="contactForm lead">
    										<div class="row">
    										      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										    
    										<input type="hidden" name="type" value="ToDay">
    											
    											  <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										</div>
    										<div class="row">
    										<div class="col-xs-3 col-sm-3 col-md-3"></div>
    											<div class="col-xs-3 col-sm-3 col-md-3">
    												<div class="form-group">
    										<input type="submit" value="Todays details" class="btn btn-skin btn-block">
    												</div>
    											</div>
    											
    										</div>
    										
    									
    									</form>
								</div>
							</div>				
						
						</div>
						</div>

									</div>		
			</div>
		</div>		
    </section>
	
	<!-- /Section: intro -->


	<!-- Section: intro -->
    <section id="week" class="intro">
<div class="intro-content">
			<div class="container">
				<div class="row">
					<div class="wow fadeInDown" data-wow-offset="0" data-wow-delay="0.1s">
					</div>
						<div class="form-wrapper">
						<div>
						
							<div class="panel panel-skin">
									<div class="panel-body">
    					                <form action="./pharmacy" method="post" role="form" class="contactForm lead">
    										<div class="row">
    										      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										    <input type="hidden" name="type" value="week">
    										
    											<div class="col-md-3">
    												<div class="form-group">
    													<label>Start Date</label>
    												</div>
    											</div>
    											<div class="col-xs-3">
    												<div class="form-group">
    													<input type="date" name="startDate" id="address" class="form-control input-md">		</div>
    											</div>
    											  <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										</div>
    										<div class="row">
    										      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										    
    										
    											<div class="col-md-3">
    												<div class="form-group">
    													<label>End Date</label>
    												</div>
    											</div>
    											<div class="col-xs-3">
    												<div class="form-group">
    													<input type="date" name="endDate" id="address" class="form-control input-md">		</div>
    											</div>
    											  <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										</div>
    										<div class="row">
    										<div class="col-xs-3 col-sm-3 col-md-3"></div>
    											<div class="col-xs-3 col-sm-3 col-md-3">
    												<div class="form-group">
    										<input type="submit" value="Submit" class="btn btn-skin btn-block">
    												</div>
    											</div>
    											
    										</div>
    										
    									
    									</form>
								</div>
							</div>				
						
						</div>
						</div>

									</div>		
			</div>
		</div>		
    </section>
	
   	
	

	<!-- Section: team -->
    <section id="all" class="home-section bg-gray paddingbot-60">
		<div class="intro-content">
			<div class="container">
				<div class="row">
					<div class="wow fadeInDown" data-wow-offset="0" data-wow-delay="0.1s">
					</div>
						<div class="form-wrapper">
						<div>
						
							<div class="panel panel-skin">
									<div class="panel-body">
    					                <form action="./pharmacy" method="post" role="form" class="contactForm lead">
    										<div class="row">
    										      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										    
    										<input type="hidden" name="type" value="all">
    											
    											  <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										</div>
    										<div class="row">
    										<div class="col-xs-3 col-sm-3 col-md-3"></div>
    											<div class="col-xs-3 col-sm-3 col-md-3">
    												<div class="form-group">
    										<input type="submit" value="View All" class="btn btn-skin btn-block">
    												</div>
    											</div>
    											
    										</div>
    										
    									
    									</form>
								</div>
							</div>				
						
						</div>
						</div>

									</div>		
			</div>
		</div>		
	</section>
	<!-- /Section: team -->

    <section id="search" class="home-section bg-gray paddingbot-60">
<div class="intro-content">
			<div class="container">
				<div class="row">
					<div class="wow fadeInDown" data-wow-offset="0" data-wow-delay="0.1s">
					</div>
						<div class="form-wrapper">
						<div>
						
							<div class="panel panel-skin">
									<div class="panel-body">
    					                <form action="./pharmacy" method="post" role="form" class="contactForm lead">
    										<div class="row">
    										      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										    <input type="hidden" name="type" value="search">
    										
    											<div class="col-md-3">
    												<div class="form-group">
    													<label>Chose Date</label>
    												</div>
    											</div>
    											<div class="col-xs-3">
    												<div class="form-group">
    													<input type="date" name="startDate" id="address" class="form-control input-md">		</div>
    											</div>
    											  <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										</div>
    										<div class="row">
    										      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    									  <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										</div>
    										<div class="row">
    										<div class="col-xs-3 col-sm-3 col-md-3"></div>
    											<div class="col-xs-3 col-sm-3 col-md-3">
    												<div class="form-group">
    										<input type="submit" value="Submit" class="btn btn-skin btn-block">
    												</div>
    											</div>
    											
    										</div>
    										
    									
    									</form>
								</div>
							</div>				
						
						</div>
						</div>

									</div>		
			</div>
		</div>		
	</section>
	<!-- /Section: team -->

	
	
		
	<!-- Section: works -->
		<footer>
	
		<div class="container">
			<div class="row">
				<div class="col-sm-6 col-md-4">
					<div class="wow fadeInDown" data-wow-delay="0.1s">
					<div class="widget">
						<h5>About us</h5>
						<p>
				        A user friendly platform providing multiple facilities.For any queries please mail us @ehealthsit@gmail.com

						</p>
					</div>
					</div>
					<div class="wow fadeInDown" data-wow-delay="0.1s">
					<div class="widget">
						<h5>Information</h5>
						<ul>
							<li><a href="#">Home</a></li>
							<li><a href="#">Laboratory</a></li>
							<li><a href="#">Medical treatment</a></li>
							<li><a href="#">Terms & conditions</a></li>
						</ul>
					</div>
					</div>
				</div>
				<div class="col-sm-6 col-md-4">
					<div class="wow fadeInDown" data-wow-delay="0.1s">
					<div class="widget">
						<h5>E-Health center</h5>
						<p>
						B.H road,Tumakuru-572103
						</p>
						<ul>
							<li>
								<span class="fa-stack fa-lg">
									<i class="fa fa-circle fa-stack-2x"></i>
									<i class="fa fa-calendar-o fa-stack-1x fa-inverse"></i>
								</span> Monday - Saturday, 8am to 10pm
							</li>
							<li>
								<span class="fa-stack fa-lg">
									<i class="fa fa-circle fa-stack-2x"></i>
									<i class="fa fa-phone fa-stack-1x fa-inverse"></i>
								</span> +91 9886771179
							</li>
							<li>
								<span class="fa-stack fa-lg">
									<i class="fa fa-circle fa-stack-2x"></i>
									<i class="fa fa-envelope-o fa-stack-1x fa-inverse"></i>
								</span> likhi1996@gmail.com
							</li>
							<li>
							<a style="color: black;"href="https://smartehealthautow.com/"><b>Click here for more  </b></a>
							</li>

						</ul>
					</div>
					</div>
				</div>
				<div class="col-sm-6 col-md-4">
					<div class="wow fadeInDown" data-wow-delay="0.1s">
					<div class="widget">
						<h5>Our location</h5>
						<p>Sit,CSE,Tumakuru,India</p>		
						
					</div>
					</div>
					<div class="wow fadeInDown" data-wow-delay="0.1s">
					<div class="widget">
						<h5>Follow us</h5>
						<ul class="company-social">
								<li class="social-facebook"><a href="#"><i class="fa fa-facebook"></i></a></li>
								<li class="social-twitter"><a href="#"><i class="fa fa-twitter"></i></a></li>
								<li class="social-google"><a href="#"><i class="fa fa-google-plus"></i></a></li>
								<li class="social-vimeo"><a href="#"><i class="fa fa-vimeo-square"></i></a></li>
								<li class="social-dribble"><a href="#"><i class="fa fa-dribbble"></i></a></li>
						</ul>
					</div>
					</div>
				</div>
			</div>	
		</div>
		<div class="sub-footer">
		<div class="container">
			<div class="row">
				<div class="col-sm-6 col-md-6 col-lg-6">
					<div class="wow fadeInLeft" data-wow-delay="0.1s">
					<div class="text-left">
					<p>&copy;Copyright-All rights reserved.</p>
					</div>
					</div>
				</div>
				<div class="col-sm-6 col-md-6 col-lg-6">
					<div class="wow fadeInRight" data-wow-delay="0.1s">
    					<div class="text-right">
    						<div class="credits">
                                <!-- 
                                    All the links in the footer should remain intact. 
                                    You can delete the links only if you purchased the pro version.
                                    Licensing information: https://bootstrapmade.com/license/
                                    Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Medicio
                                -->
                                <a href="https://bootstrapmade.com/free-business-bootstrap-themes-website-templates/">Smart Healthcare</a>  <a href="https://bootstrapmade.com/">Monitoring System</a>
                            </div>
    					</div>
					</div>
				</div>
			</div>	
		</div>
		</div>
	</footer>

</div>
<a href="#" class="scrollup"><i class="fa fa-angle-up active"></i></a>

	<!-- Core JavaScript Files -->
    <script src="js/jquery.min.js"></script>	 
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.easing.min.js"></script>
	<script src="js/wow.min.js"></script>
	<script src="js/jquery.scrollTo.js"></script>
	<script src="js/jquery.appear.js"></script>
	<script src="js/stellar.js"></script>
	<script src="plugins/cubeportfolio/js/jquery.cubeportfolio.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/nivo-lightbox.min.js"></script>
    <script src="js/custom.js"></script>
    <script src="contactform/contactform.js"></script>
    
</body>

</html>
