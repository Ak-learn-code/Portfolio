<script>
    // Einfaches Toggle für das mobile Menü
    const navToggle = document.getElementById('nav-toggle');
    const mobileMenu = document.getElementById('mobile-menu');
    const iconOpen = document.getElementById('icon-open');
    const iconClose = document.getElementById('icon-close');

    navToggle.addEventListener('click', () => {
      const isHidden = mobileMenu.classList.contains('hidden');
      mobileMenu.classList.toggle('hidden', !isHidden);
      iconOpen.classList.toggle('hidden', !isHidden);
      iconClose.classList.toggle('hidden', isHidden);
      navToggle.setAttribute('aria-expanded', String(isHidden));
    });
  </script>
