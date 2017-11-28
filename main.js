	(function ($) {
		"use strict";
		$(document).ready(function(){
			//one page selection page
				$('#navid').onePageNav({
					currentClass: 'current',
					changeHash: true,
					scrollSpeed: 1000,
					scrollThreshold: 0.5,
					filter: ':not(.external)',
					easing: 'swing',
					begin: function() {
						//I get fired when the animation is starting
					},
					end: function() {
						//I get fired when the animation is ending
					},
					scrollChange: function(jQuerycurrentListItem) {
						//I get fired when you enter a section and I pass the list item of the section
					}
				}); 
								
				$(".navbar-toggle").on("click", function(){
					$(".navbar-nav").addClass("mobile_menu");
				});
				$(".navbar-default .navbar-nav > li > a").on("click", function(){
					$(".navbar-collapse").removeClass("in");
				});
			//jQuery for slider page scrolling feature 
				$('a.icontop').bind('click', function(event) {
					var $anchor = $(this);
					$('html, body').stop().animate({
						scrollTop: $($anchor.attr('href')).offset().top
					}, 1000);
					event.preventDefault();
				});
			//jQuery for footer menu scrolling  feature 								
				$('a.page_scroll_top').bind('click', function(event) {
					var $anchor = $(this);
					$('html, body').stop().animate({
						scrollTop: $($anchor.attr('href')).offset().top
					}, 1000);
					event.preventDefault();
				});
			//sticky nav selection page
					$(window).load(function(){
						$(".nav_area").sticky({ topSpacing: 0 });
					});
			// Owl Carousel for main slider
					$(".slider_list").owlCarousel({			 
						autoPlay: 5000, //Set AutoPlay to seconds here
						items : 1,
						itemsDesktop : [1199,1],
						itemsDesktopSmall : [980,1],
						itemsTablet: [768,1],
						itemsTabletSmall: [480,1],
						itemsMobile : [320,1],						  						  
						navigation : false,		
					 });	
			// our Client carousel
					$("#client_owl").owlCarousel({					 
						autoPlay: 5000, //Set AutoPlay to seconds here					 
						items : 4,
						itemsDesktop : [1199,4],
						itemsDesktopSmall : [980,4],
						itemsTablet: [768,2],
						itemsTabletSmall: [480,1],
						itemsMobile : [320,1],							  
						navigation : true,					 
					});
			// our portfolio link page carousel
					$("#prot_more_owl").owlCarousel({					 
						autoPlay: 5000, //Set AutoPlay to 3 seconds					 
						items : 4,
						itemsDesktop : [1199,4],
						itemsDesktopSmall : [980,4],
						itemsTablet: [768,2],
						itemsTabletSmall: [480,1],
						itemsMobile : [320,1],							  
						navigation : true,					 
					});
			// nivo-light box Activated
					$('.light_box').nivoLightbox();			
			// mixItUp Activated 
					$('.all_project').mixItUp();
 		});



	})(jQuery);