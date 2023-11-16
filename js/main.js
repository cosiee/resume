


gsap_1.registerPlugin(ScrollToPlugin);
gsap_1.set('.main', {position:'fixed', background:'#fff', width:'100%', maxWidth:'1200px', height:'100%', top:0, left:'50%', x:'-50%'})
gsap_1.set('.scrollDist', {width:'100%', height:'200%'})
gsap_1.timeline({scrollTrigger:{trigger:'.scrollDist', start:'top top', end:'bottom bottom', scrub:1}})
    .fromTo('.sky', {y:0},{y:-200}, 0)
    .fromTo('.cloud1', {y:100},{y:-800}, 0)
    .fromTo('.cloud2', {y:-150},{y:-500}, 0)
    .fromTo('.cloud3', {y:-50},{y:-650}, 0)
    .fromTo('.mountBg', {y:-10},{y:-100}, 0)
    .fromTo('.mountMg', {y:-30},{y:-250}, 0)
    .fromTo('.mountFg', {y:-50},{y:-600}, 0)

$('#arrowBtn').on('mouseenter', (e)=>{ gsap_1.to('.arrow', {y:10, duration:0.8, ease:'back.inOut(3)', overwrite:'auto'}); })
$('#arrowBtn').on('mouseleave', (e)=>{ gsap_1.to('.arrow', {y:0, duration:0.5, ease:'power3.out', overwrite:'auto'}); })
$('#arrowBtn').on('click', (e)=>{ gsap_1.to(window, {scrollTo:innerHeight, duration:1.5, ease:'power1.inOut'}); }) // scrollTo requires the ScrollTo plugin (not to be confused w/ ScrollTrigger)
console.log("got to end");
