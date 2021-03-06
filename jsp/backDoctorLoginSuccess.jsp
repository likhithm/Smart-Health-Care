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
				<li class="active"><a href="#Appoitment">Appoitment</a></li>
				<li><a href="#patientDetails">PatientDetails</a></li>
				<li><a href="#medicalprescription">MedicalPrescription</a></li>
					<li><a href="#cases">Cases</a></li>
				<li><a href="./logout.html">Logout</a></li>
				
			  </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
	

	<!-- Section: intro -->
    <section id="Appoitment" class="intro">
		<div class="intro-content">
			<div class="container">
				<div class="row">
					<div class="wow fadeInDown" data-wow-offset="0" data-wow-delay="0.1s">
					</div>
						<div class="form-wrapper">
						<div>
						
							<div class="panel panel-skin">
									<div class="panel-body">
    					                <form action="./appoitment" method="post" role="form" class="contactForm lead">
    										<div class="row">
    										      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										    
    										
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
	
	<!-- /Section: intro -->


	<!-- Section: intro -->
    <section id="patientDetails" class="intro">
		<div class="intro-content">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
					<div class="wow fadeInDown" data-wow-offset="0" data-wow-delay="0.1s">
					<h4 align="center" style="color: blue">PATIENT DETAILS</h4>
					</div>
						<div class="form-wrapper">
						<div>
						
							<div class="panel panel-skin">
							<div class="panel-heading">
									</div>
									<div class="panel-body">
    					                <form action="./patientDetails" method="post" role="form" class="contactForm lead">
    										<div class="row">
    											<div class="col-xs-6 col-sm-6 col-md-6">
    												<div class="form-group">
    													<label>PatientID:</label>
    												</div>
    											</div>
    											<div class="col-xs-6 col-sm-6 col-md-6">
    												<div class="form-group">
    													<input type="text" name="patientID" id="password" class="form-control input-md">		</div>
    											</div>
    										</div>
    										    										
    										
    										
    										
    										
    										<div class="row">
    										<div class="col-xs-3 col-sm-3 col-md-3"></div>
    											<div class="col-xs-3 col-sm-3 col-md-3">
    												<div class="form-group">
    										<input type="submit" value="Get" class="btn btn-skin btn-block">
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
		</div>		
    </section>
	
   	

	<!-- Section: services -->
    <section id="ViewDiagnosis" class="home-section nopadding paddingtop-60">

		<div class="container">

        <div class="row">
			<div class="col-sm-6 col-md-6">
				<div class="wow fadeInUp" data-wow-delay="0.2s">
				<img src="img/dummy/img-1.jpg" class="img-responsive" alt="" />
				</div>
            </div>
			<div class="col-sm-3 col-md-3">
				
				<div class="wow fadeInRight" data-wow-delay="0.1s">
                <div class="service-box">
					<div class="service-icon">
						<span class="fa fa-stethoscope fa-3x"></span> 
					</div>
					<div class="service-desc">
						<h5 class="h-light">Medical checkup</h5>
						<p>Click here for more details</p>
					</div>
                </div>
				</div>
				
				<div class="wow fadeInRight" data-wow-delay="0.2s">
				<div class="service-box">
					<div class="service-icon">
						<span class="fa fa-wheelchair fa-3x"></span> 
					</div>
					<div class="service-desc">
						<h5 class="h-light">Nursing Services</h5>
						<p>Click here for more details</p>
					</div>
                </div>
				</div>
				<div class="wow fadeInRight" data-wow-delay="0.3s">
				<div class="service-box">
					<div class="service-icon">
						<span class="fa fa-plus-square fa-3x"></span> 
					</div>
					<div class="service-desc">
						<h5 class="h-light">Pharmacy</h5>
						<p>Click here for more details</p>
					</div>
                </div>
				</div>


            </div>
			<div class="col-sm-3 col-md-3">
				
				<div class="wow fadeInRight" data-wow-delay="0.1s">
                <div class="service-box">
					<div class="service-icon">
						<span class="fa fa-h-square fa-3x"></span> 
					</div>
					<div class="service-desc">
						<h5 class="h-light">Gyn Care</h5>
						<p>Click here for more details</p>
					</div>
                </div>
				</div>
				
				<div class="wow fadeInRight" data-wow-delay="0.2s">
				<div class="service-box">
					<div class="service-icon">
						<span class="fa fa-filter fa-3x"></span> 
					</div>
					<div class="service-desc">
						<h5 class="h-light">Neurology</h5>
						<p>Click here for more details</p>
					</div>
                </div>
				</div>
				<div class="wow fadeInRight" data-wow-delay="0.3s">
				<div class="service-box">
					<div class="service-icon">
						<span class="fa fa-user-md fa-3x"></span> 
					</div>
					<div class="service-desc">
						<h5 class="h-light">Sleep Center</h5>
						<p>Click here for more details</p>
					</div>
                </div>
				</div>

            </div>
			
        </div>		
		</div>
	</section>
	<!-- /Section: services -->
	

	<!-- Section: team -->
    <section id="medicalprescription" class="home-section bg-gray paddingbot-60" style="background: wheat">
		<div class="container marginbot-50">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
				</div>
			</div>
		</div>
		
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
				
           
            <div id="grid-container" class="cbp-l-grid-team">
            					
                       </div>
			</div>
			<h4 align="center" style="color: blue">Medical Prescription</h4>
			    					                <form action="./medicalprescription" method="post" role="form" class="contactForm lead">
    				<div class="row">
    										      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    						
    										
    											<div class="col-md-3">
    												<div class="form-group">
    													<label>PatientID</label>
    												</div>
    											</div>
    											<div class="col-xs-3">
    												<div class="form-group">
    													<input type="text" name="PatientID" id="address" class="form-control input-md">		</div>
    											</div>
    														      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										</div>
			    										<div class="row">
    										      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    						
    										
    											<div class="col-md-3">
    												<div class="form-group">
    													<label>PhysicianID</label>
    												</div>
    											</div>
    											<div class="col-xs-3">
    												<div class="form-group">
    													<input type="text" name="physicianid" id="address" class="form-control input-md">		</div>
    											</div>
    														      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										</div>
    										
			<div class="row">
    										      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    						
    										
    											<div class="col-md-3">
    												<div class="form-group">
    													<label>PharmacyID</label>
    												</div>
    											</div>
    											<div class="col-xs-3">
    												<div class="form-group">
    													<input type="text" name="PharmacyID" id="address" class="form-control input-md">		</div>
    											</div>
    														      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										</div>
			    	<div class="row">
    										      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    						
    										
    											<div class="col-md-3">
    												<div class="form-group">
    													<label>Medicine</label>
    												</div>
    											</div>
    											<div class="col-xs-3">
    												<div class="form-group">
    													<input type="text" name="medicine" id="address" class="form-control input-md">		</div>
    											</div>
    														      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										</div>
    										<div class="row">
    										      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    						
    										
    											<div class="col-md-3">
    												<div class="form-group">
    													<label>Dosage</label>
    												</div>
    											</div>
    											<div class="col-xs-3">
    												<div class="form-group">
    													<input type="text" name="dosage" id="address" class="form-control input-md">		</div>
    											</div>
    														      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										</div>
			    	<div class="row">
    										      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    						
    										
    											<div class="col-md-3">
    												<div class="form-group">
    													<label>TimeofDay</label>
    												</div>
    											</div>
    											<div class="col-xs-3">
    												<div class="form-group">
    													<input type="text" name="TimeofDay" id="address" class="form-control input-md">		</div>
    											</div>
    														      <div class="col-xs-3 col-sm-3 col-md-3"></div>
    										</div>
			    	
			    	
    										<div class="row">
    										
    											
    											
    											  <div class="col-xs-3 col-sm-3 col-md-3"></div>
    											  <div class="col-xs-3 col-sm-3 col-md-3"></div>
    											  <div class="form-group" >
    		
    																					<input type="submit" name="submit">
    							</div>
    			
    										</div>
    		</form>
    		
			</div>
		</div>

	</section>
	<!-- /Section: team -->

    <section id="cases" class="home-section bg-gray paddingbot-60" style="background: wheat">
		<div class="container marginbot-50">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
				</div>
			</div>
		</div>
		
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
				
           
            <div id="grid-container" class="cbp-l-grid-team">
            					
                       </div>
			</div>
			    					                <form action="./cases" method="post" role="form" class="contactForm lead">
    			
			    
			    	
			    	
    										<div class="row">
    										
    											
    											
    											  <div class="col-xs-3 col-sm-3 col-md-3"></div>
    											  <div class="col-xs-3 col-sm-3 col-md-3"></div>
    											  <div class="form-group" >
    		
    																					<input type="submit" name="submit" value=" TodayPatient">
    							</div>
    			
    										</div>
    		</form>
    		
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
