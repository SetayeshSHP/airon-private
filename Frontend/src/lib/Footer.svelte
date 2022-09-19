<script>

</script>

<footer class="section" style="background-color: #073944;">
    <div class="container">
      <nav class="navbar-brand col-12">
        <div class="row row-footer">
            <div class="container-fluid col-lg-4 p-box1">
                <a class="navbar-brand" href="/home">
                <img src="/logoFooter.svg" alt="logo" class="img-fluid img-footer">
                </a>
            </div>
            <div class="container-fluid row p-box2 flex-container" >
                <div class=" col-lg-2 c-box2" >
                    <a class="navbar-brand" href="/impressum">Impressum</a>
                </div>
                <div class="col-lg-2 c-box3" >
                    <a class="navbar-brand" href="/privacy">Datenschutzerkärung</a>
                </div>
                <div class=" col-lg-2 c-box1" >
                    <a class="navbar-brand" href="/home">
                        Aulweg 128; 1. OG<br>35392 Gießen
                    </a>
                </div>
            </div>
           
        </div>
      </nav>
    </div>
</footer>


<style>


.img-fluid{
    max-width: 60%;
    width: 10.5rem;
}

footer{
    position: absolute;
    min-width: 100%;
    bottom: 0;
}
.navbar-brand{
    color: #EFF4F7;
    font-size: 0.9rem;
}

.row{
    justify-content: center;
    align-items: center;
}


@media (max-width: 992px) {
    .img-footer{
        max-width: 144px;
        max-height: 144px;
    }
 }

 @media (max-width: 770px) {

   .img-footer{
       padding-left: 15%;
   }
 }

.col-lg-2{
 padding-right: 2rem;
}
.p-box1{
    flex:5;
}
.p-box2{
    flex:4;
}
.c-box1{
    flex:2;

}
.c-box2{
    flex:1;
}
.c-box3{
    flex:2;
}

@media (max-width: 992px) {
    .c-box1{
        padding-top: 0.2rem;
    }
    .c-box2{
        padding-bottom: 0.2rem;
    }
}

</style>
