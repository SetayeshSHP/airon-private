<script>
import Header from "$lib/Header.svelte";
import Footer from "$lib/Footer.svelte";
import "../styles/global.css";

</script>


 <Header/>

<main>
    <!--page content-->
<slot></slot>
</main>


<Footer/> 
