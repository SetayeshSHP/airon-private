<script>
</script>

<header class="section shadow-sm p-3 mb-5 bg-white rounded">
    <div class="container">
        <nav class="navbar navbar-expand-lg navbar-light" >
            <div class="container-fluid">
              <a class="navbar-brand" href="/home">
                  <img src="/logo.svg" alt="logo" class="img-fluid">
              </a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                  <li class="nav-item">
                    <a class="nav-link active home" aria-current="page" href="/home">Home</a>
                  </li>
                  <li class="nav-item">
                    <!--dynamic changes-->
                    <a class="nav-link" href="/analysis" style="font-weight: 600;">Analyse</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href="/result">Ergebnisse</a>
                  </li>
                  <li class="nav-item">
                    <p class="nav-link nav-space"></p>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link logging" href="#">Abmelden</a>
                  </li>
                  <li class="nav-item dm-container">
                    <!--
                      text-align: -webkit-center;
                    -->
                    <img src="/darkmode.svg" alt="DarkmodeIcon" class="img-fluid darkmode">
                </li>
                  
                </ul>
              </div>
            </div>
          </nav>
    </div>
</header>

<style>

.img-fluid{
    max-width: 60%;
}

.navbar-brand {
    min-width: 15%;
}

.navbar-collapse{
    justify-content: flex-end;
}

.navbar-expand-lg .navbar-nav .nav-link {
    padding-right: 1.3rem;
    padding-left: 1.3rem;
}
.nav-item{
    font-size: 1.5em;
}

.navbar-light .navbar-nav .nav-link {
    color: #073944;
    font-weight: 400;
    font-size: 1rem;
    white-space: nowrap;
}
.navbar-light .navbar-nav .nav-link.active{
    color: #073944;
}

.nav-space{
    min-width: 15rem;
}

@media (max-width: 1200px) { 
    .nav-space{
         min-width: 3rem;
    }

    .navbar-light .navbar-nav .nav-link {
        font-size: 0.89rem;
        padding-left: 0.1rem;

    }

 }

 @media (max-width: 992px) {
    .darkmode{
        height: 33px;
        padding-left: 0.1rem;
        margin-top: 0.7rem;
    }
    .dm-container{
       text-align: start !important;
     }
    .nav-space{
         max-width: 0px;
    }
    .home{
        margin-top: 1rem;
    }
 }

.p-3{
  padding: 0.5rem 1rem!important;
}

.dm-container{
  text-align: end;
}

.logging{
  padding-right: 0 !important;
}
</style>
