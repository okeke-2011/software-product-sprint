// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const facts =
      ['Education Level: Rising junior', 'Age: 18 years old', 'DOB: November 27th, 2002', 'Height: 6ft'];

  // Pick a random greeting.
  const fact = facts[Math.floor(Math.random() * facts.length)];

  // Add it to the page.
  const factContainer = document.getElementById('fact-container');
  factContainer.innerText = fact;
}

async function greetUser() {
  const responseFromServer = await fetch('/hello');
  const textFromResponse = await responseFromServer.text();

  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = textFromResponse;
}
