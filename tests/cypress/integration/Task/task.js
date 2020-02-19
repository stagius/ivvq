import {Then, When} from "cypress-cucumber-preprocessor/steps";


When(/^I visit the url \/task\/1$/, () => {
    cy.visit('/task/1')
});

Then(/something is displayed$/, () => {
    cy.contains('Task detail')
});