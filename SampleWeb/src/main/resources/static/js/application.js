/**
 * 
 */
$('.openbtn4').click(function () {
    $(this).toggleClass('active');
});

$(function(){
  $('openbtn4').on('click', function(){
    $('.menu').toggleClass('is-active');
  });
}());