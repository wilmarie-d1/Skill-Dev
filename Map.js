let map, infoWindow;


// Initialize and add the map
function initMap() {
    // The location of Uluru
    const dallasAquarium = { lat:  32.783537699942244, lng: -96.80533222610609  };
    const illusionMuseum = {lat: 32.78194478171139, lng: -96.80668837799938};

    // The map, centered at Uluru
    const map = new google.maps.Map(document.getElementById("map"), {
        zoom: 12,
        center: dallasAquarium,
    });
    // The marker, positioned at Uluru
    const marker = new google.maps.Marker({
        position: dallasAquarium,
        map: map,
    });
    const marker2 = new google.maps.Marker({
        position: illusionMuseum,
        map: map,
    });
    infoWindow = new google.maps.InfoWindow();

    const locationButton = document.createElement("button");

    locationButton.textContent = "Pan to Current Location";
    locationButton.classList.add("custom-map-control-button");
    map.controls[google.maps.ControlPosition.TOP_CENTER].push(locationButton);
    locationButton.addEventListener("click", () => {
        // Try HTML5 geolocation.
        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(
                (position) => {
                    const pos = {
                        lat: position.coords.latitude,
                        lng: position.coords.longitude,
                    };

                    infoWindow.setPosition(pos);
                    infoWindow.setContent("Location found.");
                    infoWindow.open(map);
                    map.setCenter(pos);
                },
                () => {
                    handleLocationError(true, infoWindow, map.getCenter());
                }
            );
        } else {
            // Browser doesn't support Geolocation
            handleLocationError(false, infoWindow, map.getCenter());
        }
    });


function handleLocationError(browserHasGeolocation, infoWindow, pos) {
    infoWindow.setPosition(pos);
    infoWindow.setContent(
        browserHasGeolocation
            ? "Error: The Geolocation service failed."
            : "Error: Your browser doesn't support geolocation."
    );
    infoWindow.open(map);
}
const contentString =
    '<div id="content">' +
    '<div id="siteNotice">' +
    "</div>" +
    '<h1 id="firstHeading" class="firstHeading">Dallas Aquarium</h1>' +
    '<div id="bodyContent">' +
    "<p><b>The Famous Dallas Aquarium</b>, also referred to as <b>Hibachi Center</b>, is a large " + "Replica habitats containing exotic birds, mammals & fish are open for public tours & private events.\n" +
    "</p>" +
    '<p>The Dallas World Aquarium <a href="https://dwazoo.com/">' +
    "https://dwazoo.com/</a> " +
    "</p>" +
    "</div>" +
    "</div>";

const infowindow2 = new google.maps.InfoWindow({
    content: contentString,
    ariaLabel: "Dallas World Museum",
});


marker.addListener("click", () => {
    infowindow2.open({
        anchor: marker,
        map,
    });
});


}
window.initMap = initMap;