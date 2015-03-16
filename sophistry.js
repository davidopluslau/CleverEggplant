var views = ["menu", "about", "staff", "faqs", "tips"];
var buttons = ["menuButton", "aboutButton", "staffButton", "faqsButton", "tipsButton"];
var titles = ["Menu", "About", "Staff", "FAQs", "Tips"];

function show(elementId) {
    var titleToChange;
    var buttonToChange;
    for (var i = 0; i < views.length; i++) {
        var view = views[i];
        if (view != elementId) {
            var element = document.getElementById(view);
            element.style.display = "none";
            var buttonReset = document.getElementById(buttons[i]);
            buttonReset.innerHTML = titles[i];
        } else {
            titleToChange = titles[i];
            buttonToChange = buttons[i];
        }
    }
    var show = document.getElementById(elementId);
    show.style.display = "block";
    var button = document.getElementById(buttonToChange);
    button.innerHTML = ">" + titleToChange + "<";
}


function showMenu() {
    show("menu");
}

function showAbout() {
    show("about");
}

function showStaff() {
    show("staff");
}

function showFaqs() {
    show("faqs");
}

function showTips() {
    show("tips");
}

showMenu();

var menu = document.getElementById("menuButton");
menu.addEventListener("click", showMenu);

var about = document.getElementById("aboutButton");
about.addEventListener("click", showAbout);

var staff = document.getElementById("staffButton");
staff.addEventListener("click", showStaff);

var faqs = document.getElementById("faqsButton");
faqs.addEventListener("click", showFaqs);

var tips = document.getElementById("tipsButton");
tips.addEventListener("click", showTips);
