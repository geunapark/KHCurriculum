const moreBtn = document.querySelector('.info .metadata .moreBtn');
const title = document.querySelector('.info .metadata .title');

moreBtn.addEventListener('Click', () => { 
  moreBtn.classList.toggle('clicked');
  title.classList.toggle('clamp');
});
// var video = document.getElementById('introVideo');
// video.onended = function() {
//     // When the video has finished playing
//     document.getElementById('mainContent').style.display = 'block';
//     video.style.display = 'none'; // Optionally hide the video
// };