
import React from 'react';
import './About.css';

const About = () => {
  return (
    <>
  <link
    href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
    rel="stylesheet"
    id="bootstrap-css"
  />
  <link
    href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"
    rel="stylesheet"
  />
  <div className="about-section paddingTB60 gray-bg">
    <div className="container">
      <div className="row">
        <div className="col-md-7 col-sm-6">
          <div className="about-title clearfix">
            <h1>
              About <span>Page</span>
            </h1>
            <h3>I'm VIVEK KR SHARMA </h3>   
            <p className="about-paddingB">
            hey. welcome to my NewsWorldView you will get all types of news on my news page entertainments,sports,bussiesss etc. All news is latest or new, real news is provided to you on our page.{" "}
            </p>
            <p>
            Reviews, client logos, case studies, and testimonials bring consistency to your About Us page. Social proof demonstrates the authenticity of your claims and the impact you can bring to future clients.
            </p>

            <p>
            With these four components in mind, you will have a framework from which to build an engaging and unique About Us page that incorporates your business’s most important asset: your clients.
            </p>
            <div className="about-icons">
              <ul>
                <li>
                  <a href="https://www.facebook.com/vivek.vibersharma.5">
                    <i
                      id="social-fb"
                      className="fa fa-facebook-square fa-3x social"
                    />
                  </a>{" "}
                </li>
                <li>
                  <a href="https://github.com/viveksharma62">
                    <i
                      id="social-tw"
                      className="fa  fa-github-square fa-3x social"/>
                  </a>{" "}
                </li>
                <li>
                  {" "}
                  <a href="https://www.instagram.com/vivek_sharma62/">
                    <i
                      id="social-gp"
                      className="fa fa-instagram fa-3x social"
                    />
                  </a>{" "}
                </li>
                <li>
                  {" "}
                  <a href="https://www.linkedin.com/in/vivek-kumar-mefg-35637b26a/">
                    <i
                      id="social-em"
                      className="fa fa-linkedin-square fa-3x social"
                    />
                  </a>{" "}
                </li>
              </ul>
            </div>
          </div>
        </div>
        <div className="col-md-5 col-sm-6">
          <div className="about-img">
            <img
              src="https://devitems.com/preview/appmom/img/mobile/2.png"
              alt=""
            />
          </div>
        </div>
      </div>
    </div>
  </div>
</>

  );
};

export default About;
