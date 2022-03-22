const resemble = require('resemblejs');
const puppeteer = require('puppeteer');

//login function for user and admin
(async () => {
    const browser = await puppeteer.launch();
    const page = await browser.newPage();
    try{
    await page.goto('https://8081-eebeafbcddaeffffacfefaffeafcdbeeafffede.examlyiopb.examly.io/login');
    await page.setViewport({
      width:1200,
      height:800,
    })
    await page.waitForSelector('[data-testid="loginBox"]',{timeout:1500});
    await page.click('[data-testid="userTab"]');
    await page.waitForNavigation();
    await page.type('[data-testid="email"]', 'user@iamneo.ai');
    await page.type('[data-testid="password"]', 'neo');
    await page.click('[data-testid="submitButton"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="userNavbar"]',{timeout:1500});
    await page.click('[data-testid="userLogoutButton"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="loginBox"]',{timeout:1500});
    await page.click('[data-testid="adminTab"]');
    await page.type('[data-testid="email', 'admin@iamneo.ai"]');
    await page.type('[data-testid="password"]', 'neo');
    await page.click('[data-testid="submitButton"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="adminNavbar"]',{timeout:1500});
    await page.click('[data-testid="adminLogoutButton"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="loginBox"]',{timeout:1500});
    console.log('TESTCASE:test_case6:success');
    }
     catch(e){
      console.log('TESTCASE:test_case6:failure');
    }finally{
      await page.close();
      await browser.close();
    }
  })();


//user workflow testcase
  (async () => {

    const browser = await puppeteer.launch();
    const page = await browser.newPage();
    try {
      await page.goto('https://8081-eebeafbcddaeffffacfefaffeafcdbeeafffede.examlyiopb.examly.io/login');
    await page.setViewport({
      width:1200,
      height:800,
    })
    
    await page.waitForSelector('[data-testid="loginBox"]',{timeout:1500});
    await page.click('[data-testid="userTab"]');
    await page.waitForNavigation();
    await page.type('[data-testid="email"]', 'user@iamneo.ai');
    await page.type('[data-testid="password"]', 'neo');
    await page.click('[data-testid="submitButton"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="userNavbar"]',{timeout:1500});
    await page.click('[data-testid="userDashboardLink"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="userDashboard"]',{timeout:1500});
    await page.click('[data-testid="userProfileLink"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="userProfileBody"]',{timeout:1500});
    await page.click('[data-testid="userBookingLink"]');
    await page.waitForSelector('[data-testid="userBookingBody"]');
    await page.click('[data-testid="userLogoutButton"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="loginBox"]',{timeout:1500});
    console.log('TESTCASE:test_case7:success');
    } catch(e) {
      console.log('TESTCASE:test_case7:failure');
    }finally{
      await page.close();
      await browser.close();
    }
  })();

//admin workflow testcase
  (async () => {

    const browser = await puppeteer.launch();
    const page = await browser.newPage();
    try {
      await page.goto('https://8081-eebeafbcddaeffffacfefaffeafcdbeeafffede.examlyiopb.examly.io/login');
    await page.setViewport({
      width:1200,
      height:800,
    })
    
    await page.waitForSelector('[data-testid="loginBox"]',{timeout:1500});
    await page.click('[data-testid="adminTab"]');
    await page.waitForNavigation();
    await page.type('[data-testid="email"]', 'admin@iamneo.ai');
    await page.type('[data-testid="password"]', 'neo');
    await page.click('[data-testid="submitButton"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="adminNavbar"]',{timeout:1500});
    await page.click('[data-testid="adminDashboardLink"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="adminDashboard"]',{timeout:1500});
    await page.click('[data-testid="adminProfileLink"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="adminProfile"]',{timeout:1500});
    await page.click('[data-testid="adminBookingLink"]');
    await page.waitForSelector('[data-testid="adminBookings"]');
    await page.click('[data-testid="adminLogoutButton"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="loginBox"]',{timeout:1500});
    console.log('TESTCASE:test_case8:success');
    } catch(e) {
      console.log('TESTCASE:test_case8:failure');
    }finally{
      await page.close();
      await browser.close();
    }
  })();

//super-admin workflow testcase
  (async () => {

    const browser = await puppeteer.launch();
    const page = await browser.newPage();
    try {
      await page.goto('https://8081-eebeafbcddaeffffacfefaffeafcdbeeafffede.examlyiopb.examly.io/superadmin/login');
    await page.setViewport({
      width:1200,
      height:800,
    })

    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="superAdminLoginBox"]',{timeout:1500});
    await page.type('[data-testid="email"]', 'superadmin@iamneo.ai');
    await page.type('[data-testid="password"]', 'neo');
    await page.click('[data-testid="submitButton"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="superAdminNavbar"]',{timeout:1500});
    await page.click('[data-testid="superAdminDashboardLink"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="allUserDetails"]',{timeout:1500});
    await page.click('[data-testid="superAdminBookingLink"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="allAdminDetails"]',{timeout:1500});
    await page.click('[data-testid="adminLogoutButton"]');
    await page.waitForNavigation();
    await page.waitForSelector('[data-testid="superAdminLoginBox"]',{timeout:1500});
    console.log('TESTCASE:test_case9:success');
    } catch(e) {
      console.log('TESTCASE:test_case9:failure');
    }finally{
      await page.close();
      await browser.close();
    }
  })();
  
 //checking Authentication
  (async () => {

    const browser = await puppeteer.launch();
    const page = await browser.newPage();
    
    
    try {
      await page.goto('https://8081-eebeafbcddaeffffacfefaffeafcdbeeafffede.examlyiopb.examly.io/user/dashboard');
      await page.setViewport({
        width:1200,
        height:800,
      })
    	await page.waitForNavigation();
    	await page.waitForSelector('[data-testid="loginBox"]',{timeout:1500});
      	console.log('TESTCASE:test_case10:success');
    } catch(e) {
      console.log('TESTCASE:test_case10:failure');
    }finally{
      await page.close();
  await browser.close();
    }
  })();